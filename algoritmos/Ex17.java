package listaExercicios;

class Mae extends PessoaEx17{
    private String hobby;
    public Mae(String nome, Integer idade){
        super(nome, idade);
        this.hobby = "series";
    }
    @Override
    public String toString(){
        return "nome: "+getNome()+"\nidade: "+getIdade()+"\nhobby: "+this.hobby;
    }
}

class Pai extends PessoaEx17 {
    private String hobby;
    public Pai(String nome, Integer idade){
        super(nome, idade);
        this.hobby = "futebol";
    }

    @Override
    public String toString(){
        return "nome: "+getNome() +"\nidade: "+getIdade()+"\nhobby: "+this.hobby;
    }
}

public class Ex17 {
    public static void main(String[] args){
        PessoaEx17 pai = new Pai("elon musk", 50);
        System.out.println(pai);
    }
}
