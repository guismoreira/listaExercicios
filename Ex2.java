package listaExercicios;

class Produto{
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public String getNome() {
		return this.nome;
	}
	public Double getPreco() {
		return this.preco;
	}
	public Integer getQuantidade() {
		return this.quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double precoFinal() {
		Double total=null;
		if(getQuantidade() >= 11 && getQuantidade() <=20) {
			total = getPreco() - (getPreco() * 0.10);
		}else if(getQuantidade() >= 21 && getQuantidade() <= 50) {
			total = getPreco() - (getPreco() * 0.20);
		}else if(getQuantidade() > 50) {
			total = getPreco() - (getPreco() * 0.25);
		}
		else {
			total = getPreco();
		}
		return total;
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("tv");
		p1.setPreco(20000.0);
		p1.setQuantidade(62);
		
		System.out.println("produto: "+p1.getNome()+" custa: "+p1.precoFinal());
	}

}
