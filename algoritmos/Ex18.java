package listaExercicios;

import listaExercicios.automovel.Automovel;
import listaExercicios.automovel.carro.Carro;
import listaExercicios.automovel.carro.CarroAutomatico;
import listaExercicios.automovel.moto.MotoPartidaPedal;

public class Ex18 {
    public static void main(String[] args) {
    	
    	boolean acao = true;
    	CarroAutomatico cAuto = new CarroAutomatico(4, 120);
		cAuto.frear(acao);
		cAuto.ligar();
    	System.out.println(cAuto);

		MotoPartidaPedal mPartida = new MotoPartidaPedal(2, 90);
		mPartida.acelerar(acao);
		mPartida.ligar();
		System.out.println(mPartida);

    }
}
