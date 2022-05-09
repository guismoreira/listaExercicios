package listaExercicios.automovel.carro;

public class CarroAutomatico extends Carro{
    
	private boolean freio;
    
	public CarroAutomatico() {
    	super();
    }
    
	public CarroAutomatico(boolean freio) {
    	super();
    	this.freio = freio;
    }
    public void ligar(boolean freio){
    	if(freio == true) {
            this.freio = true;
    	}
    }
}
