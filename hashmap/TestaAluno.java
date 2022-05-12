package listaExercicios.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaAluno {
	
public static void main(String[] args) {
	
	List<Aluno> alunos = new ArrayList<>();
	
	Aluno a1 = new Aluno("guilherme", 10);
	Aluno a2 = new Aluno("marcos", 9);
	Aluno a3 = new Aluno("jose", 9);
	
	alunos.add(a1);
	alunos.add(a2);
	alunos.add(a3);
	
	AlunoService alunoService = new AlunoService();
	alunoService.alunosPorNota(alunos);
	
}

}
