package listaExercicios;

import listaExercicios.automovel.Automovel;
import listaExercicios.automovel.carro.Carro;
import listaExercicios.automovel.carro.CarroAutomatico;

public class Ex18 {
    public static void main(String[] args) {
    	
    	boolean freio = true;
    	CarroAutomatico carro = new CarroAutomatico(4, 120);
    	System.out.println(carro.toString());
    	carro.ligar(freio);
    	System.out.println(carro.toString());
    }
}
