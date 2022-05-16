package listaExercicios.algoritmos.hashmap;

public class Aluno {
	String nome;
	Integer nota;
	
	public Aluno() {}
	public Aluno(String nome, Integer nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return "[nome: " + this.nome + ", " +
			   "nota: "+ this.nota+"]";
	}
}
