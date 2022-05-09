package listaExercicios.automovel.moto;

import listaExercicios.automovel.Automovel;

public class Moto extends Automovel {
	
	public Moto() {
		super();
	}
    public String toString() {
    	return "\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
