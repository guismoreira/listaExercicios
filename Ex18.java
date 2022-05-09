package listaExercicios;

import listaExercicios.automovel.Automovel;
import listaExercicios.automovel.carro.Carro;
import listaExercicios.automovel.carro.CarroAutomatico;

public class Ex18 {
    public static void main(String[] args) {
    	
    	boolean estado = true;
    	CarroAutomatico carro = new CarroAutomatico();
    	System.out.println(carro.toString());
    	carro.ligar(estado);
    	System.out.println(carro.toString());
    }
}
