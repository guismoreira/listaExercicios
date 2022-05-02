package listaExercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Double res;
		Double val1;
		Double val2;
		
		System.out.println("Selecione uma das operações");
		System.out.println("x, /, -, +");
		Scanner inputUsuario = new Scanner(System.in);
		String op = inputUsuario.nextLine();
		
		switch(op) {
		case "x":
			System.out.println("multiplicacao");
			
			System.out.println("digite o primeiro valor");
			val1 = inputUsuario.nextDouble();
			System.out.println("digite o segundo valor");
			val2 = inputUsuario.nextDouble();
			res = val1 * val2;
			System.out.println("resultado: " + res);
			break;
		case "/":
			System.out.println("divisao");
			
			System.out.println("digite o primeiro valor");
			val1 = inputUsuario.nextDouble();
			System.out.println("digite o segundo valor");
			val2 = inputUsuario.nextDouble();
			res = val1/val2;
			System.out.println("resultado: " + res);
			break;
		case "-":
			System.out.println("subtracao");
			
			System.out.println("digite o primeiro valor");
			val1 = inputUsuario.nextDouble();
			System.out.println("digite o segundo valor");
			val2 = inputUsuario.nextDouble();
			res = val1-val2;
			System.out.println("resultado: " + res);
			break;
		case "+":
			System.out.println("adicao");
			
			System.out.println("digite o primeiro valor");
			val1 = inputUsuario.nextDouble();
			System.out.println("digite o segundo valor");
			val2 = inputUsuario.nextDouble();
			res = val1 + val2;
			System.out.println("resultado: " + res);
			break;
		default:
			System.out.println("dado invalido");
		}

	}

}
