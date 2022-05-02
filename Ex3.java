package listaExercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		
		String jogador = "pedra";
		
		Random r = new Random();
		List<String> listaJogo = Arrays.asList("pedra", "papel", "tesoura");
		int randomItem = r.nextInt(listaJogo.size());
		String maquina = listaJogo.get(randomItem);
		
		if(jogador == "pedra" && maquina == "papel") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("maquina vence");
			
		}else if(jogador == "pedra" && maquina == "pedra") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("empate");
			
		}else if(jogador == "pedra" && maquina == "tesoura") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("jogador vence");
			
		}else if(jogador == "papel" && maquina == "papel") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("empate");
			
		}else if(jogador == "papel" && maquina == "pedra") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("jogador vence");
			
		}else if(jogador == "papel" && maquina == "tesoura") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("maquina vence");
			
		}else if(jogador == "tesoura" && maquina == "papel") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("jogador vence");
			
		}else if(jogador == "tesoura" && maquina == "pedra") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("maquina vence");
			
		}else if(jogador == "tesoura" && maquina == "tesoura") {
			System.out.println("jogador: "+jogador+" maquina: "+maquina);
			System.out.println("empate");
			
		}
		
	}

}
