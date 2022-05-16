package listaExercicios;

public class Ex7 {

	public static void main(String[] args) {
		Integer num = 10;
		Integer pos[] = new Integer[num];
		for(int i = 0; i < num; i++) {
			if(i>1) {
				pos[i] = pos[i-1] + pos[i-2];
				System.out.println(pos[i-1] + " + " + pos[i-2] + " = " + pos[i]);
			}else {
				pos[0] = 0;
				pos[1] = 1;
			}
		}
	}
}
