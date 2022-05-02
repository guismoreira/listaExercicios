package listaExercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class BubbleSort {
	
	void bubbleSort(int bubbleArray[]) {
		int num = bubbleArray.length;
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<num-i-1; j++) {
				if(bubbleArray[j] > bubbleArray[j+1]) {
					int temp = bubbleArray[j];
					bubbleArray[j] = bubbleArray[j + 1];
					bubbleArray[j + 1] = temp;
				}
			}
		}
	}
	
	void printArray(int vet[]) {
		int n=vet.length;
		for(int i=0; i<n; ++i){
			System.out.println(vet[i]+" ");
		System.out.println();
		}
	}
}

public class Ex11 {

	
	public static void main(String[] args) {

		Random r = new Random();
		BubbleSort b = new BubbleSort();
		int vet[] = new int[100];
		for(int i=0; i < vet.length; i++) {
			vet[i] = r.nextInt();
		}
		b.bubbleSort(vet);
		b.printArray(vet);

	}

}
