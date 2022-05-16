package listaExercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

class User {
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public User(){}
	public User(String name){
		this.name = name;
	}
}
//Refazer
public class Ex11 {

	
	public static void main(String[] args) {

		Random r = new Random();
		List<User> vet = new ArrayList<>();
		vet.add(new User("guilherme moreira"));
		vet.add(new User("michael jordan"));
		vet.add(new User("guilherme silva"));

		vet.stream()
				.filter(v -> v.getName().contains("guilherme"))
				.forEach(v -> System.out.println(v.getName()));
	}

}
