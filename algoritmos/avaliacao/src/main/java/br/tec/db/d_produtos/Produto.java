package br.tec.db.d_produtos;

public class Produto {
    private Long id;
    private String nome;

    public Produto(String nome){
        this.nome=nome;
    }
    public Produto(String nome, Long id){
        this.nome=nome;
        this.id=id;
    }
    public Produto(){

    }
}
