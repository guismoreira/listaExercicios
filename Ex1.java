package listaExercicios;

class Pessoa{
	private Integer idade;
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(19);
		
		if(p1.getIdade() >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}

}
