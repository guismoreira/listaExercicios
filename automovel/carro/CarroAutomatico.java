package listaExercicios.automovel.carro;

public class CarroAutomatico extends Carro{
    
	private boolean freio;
    
	public CarroAutomatico() {
    	super();
    }
    
	public CarroAutomatico(int numRodas, int velMax) {
    	super();
    }
    public void ligar(boolean freio){
    	if(freio == true) {
            this.freio = true;
    	}
    }
    public String toString() {
    	return "\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
