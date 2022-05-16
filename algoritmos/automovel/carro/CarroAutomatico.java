package listaExercicios.automovel.carro;

public class CarroAutomatico extends Carro{

	private boolean freio;

	public CarroAutomatico() {
    	super();
    }
	public CarroAutomatico(int numRodas, int velMax) {
		super(numRodas, velMax);
	}

	public void frear(boolean freio){
		if (freio) {
			this.freio = true;
		}
	}
	public void ligar(){
    	if(this.freio) {
            this.ligado = true;
    	}
    }
    public String toString() {
    	return  "\ncarro automatico"+
				"\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
