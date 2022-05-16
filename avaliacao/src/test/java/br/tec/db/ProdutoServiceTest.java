package br.tec.db;

import org.junit.jupiter.api.Test;

import br.tec.db.d_produtos.Produto;
import br.tec.db.d_produtos.ProdutoRepository;

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

public class ProdutoServiceTest {
	
	@Test
	public void buscaProduto() {
	
	}
	
	
	@Test
	public void salvaProduto() {
	
	}
}
