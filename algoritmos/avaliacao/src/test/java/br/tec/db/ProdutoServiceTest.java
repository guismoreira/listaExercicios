package br.tec.db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.tec.db.d_produtos.Produto;
import br.tec.db.d_produtos.ProdutoRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

class ProdutoService {
	private final ProdutoRepository produtoRepository;

	
	public ProdutoService(final ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto obterProdutoPorId(Long id) {
		return produtoRepository.findById(id);
	}
	
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
}

@ExtendWith(MockitoExtension.class)
public class ProdutoServiceTest {

	@InjectMocks
	ProdutoService produtoService;

	@Mock
	ProdutoRepository produtoRepository;
	
	Produto prod;
	
	@BeforeEach
	void implementaProduto() {
		Produto prod = new Produto("tv", 1L);
	}
	
	@Test
	public void buscaProduto() {
		when(produtoRepository.findById(1L)).thenReturn(prod);
		assertEquals(prod, produtoService.obterProdutoPorId(1L));
		
		
	}
	
	
	@Test
	public void salvaProduto() {
		when(produtoRepository.save(prod)).thenReturn(prod);
		assertEquals(prod, produtoService.save(prod));
	}
}
