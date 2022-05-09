package listaExercicios.automovel.moto;

import listaExercicios.automovel.Automovel;

public class Moto extends Automovel {
	
	public Moto() {
		super();
	}
	public Moto(int numRodas, int velMax) {
		super(numRodas, velMax);
	}
    public String toString() {
    	return "\nmoto"+
				"\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
