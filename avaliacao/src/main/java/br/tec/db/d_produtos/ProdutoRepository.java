package br.tec.db.d_produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Long, Produto> {
	
	Produto findById(Long id);
	Produto save(Produto produto);
}
