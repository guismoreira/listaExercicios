package listaExercicios.automovel.carro;

import listaExercicios.automovel.Automovel;

public class Carro extends Automovel {

	public Carro() {
		super();
	}
	public Carro(int numRodas, int velMax) {
		super(numRodas, velMax);
	}
    public String toString() {
    	return "\ncarro"+
				"\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
