package listaExercicios;

public class Ex9 {

	public static void main(String[] args) {
		int i=0;
		Integer num = 25;
		Integer pos[] = new Integer[num];
		
		do {
			if(i>1) {
				pos[i] = pos[i-1] + pos[i-2];
				if(pos[i] >= num) {
					return;
				}
				System.out.println(pos[i-1] + " + " + pos[i-2] + " = " + pos[i]);
			}else {
				pos[0] = 0;
				pos[1] = 1;
			}
			i++;
		}while(i < num);
	}
}
