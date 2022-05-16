package listaExercicios;

public class PessoaEx17{
    private String nome;
    private Integer idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public PessoaEx17(){}
    public PessoaEx17(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "nome: "+ this.nome + "\n" + "idade: "+this.idade;
    }
}