package br.tec.db.b_alunos;

import br.tec.db.c_alunos.EstabelecimentoComercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoService {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno a1 = new Aluno("guilherme", 10);
		Aluno a2 = new Aluno("jonas", 7);
		Aluno a3 = new Aluno("alberto", 7);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		AlunoService alunoService = new AlunoService();
		alunoService.alunosPorNota(alunos);

	}
	
	// Qual tipo de retorno? Como organizar alunos por nota?
	public Map alunosPorNota(List<Aluno> alunos) {
		// Nota 10: Alice, Arthur
		// Nota 9: Cassiane, Karina
		// Nota 8: Samuel
		// Nota 7:
		// Nota 6: Jaqueline, Juliana, Jonathan, Jeferson
		Map<Integer, String> alunosMap = new HashMap<Integer, String>();
		for (Aluno aluno : alunos) {
			if(alunosMap.get(aluno.getNota()) != null) {
				alunosMap.put(aluno.getNota(), alunosMap.get(aluno.getNota()) + ", " + aluno.getNome()+";");
			}else{
				alunosMap.put(aluno.nota, aluno.nome);
			}
		}
		System.out.println(alunosMap);

		return null;
	}
}
