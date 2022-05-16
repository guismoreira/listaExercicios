package listaExercicios;

public class Ex10 {
 	public static void main(String[] args) {
 		Integer m[][] = new Integer[3][3];
 		Integer soma=0;
 		
 		for(int i=0; i<3; i++) {
 			System.out.println();
 			for(int j=0; j<3; j++) {
 				System.out.println(i+":"+j);
 				if(i==j) {
 					soma += i+j;
 				}
 			}
 		}
 		System.out.println("soma diagonal principal "+ soma);
 	}
}
