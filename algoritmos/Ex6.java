package listaExercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Random r = new Random();
		Integer vet[] = new Integer[101];
		Integer resFinal[] = new Integer[10];
		
		for(int i=0; i<=100; i++) {
			vet[i] = i;
		}
		System.out.println();
		List<Integer> listaNum = Arrays.asList(vet);
		Integer res;
		
		for(int i=0; i < 10; i++) {
			res = r.nextInt(listaNum.size());
			resFinal[i] = listaNum.get(res);
			
		}
		listaNum = Arrays.asList(resFinal);
		System.out.println(listaNum);
		System.out.println("maior numero " + Collections.max(listaNum));
		System.out.println("menor numero " + Collections.min(listaNum));
		
		

	}

}
