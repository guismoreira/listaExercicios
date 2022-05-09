package listaExercicios.automovel.carro;

import listaExercicios.automovel.Automovel;

public class Carro extends Automovel {
	
	public Carro() {
		super();
	}
    public String toString() {
    	return "\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
