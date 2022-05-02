package listaExercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int num=0;
		do {
			num = sc1.nextInt();
			System.out.println(num);
		} while(num != 10);
		System.out.println("fim");

	}

}
