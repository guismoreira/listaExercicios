package br.tec.db.b_alunos;

import br.tec.db.c_alunos.EstabelecimentoComercial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoService {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = Arrays.asList(
				new Aluno("jonas", 7), 
				new Aluno("guilherme", 10), 
				new Aluno("alberto", 7),
				new Aluno("andre", 10), 
				new Aluno("will", 7), 
				new Aluno("richard", 8));

		Map<Integer, String> alunosPrint = new HashMap<Integer, String>();
		AlunoService alunoService = new AlunoService();
		alunosPrint = alunoService.alunosPorNotaComString(alunos);
		
		alunosPrint.forEach((k, v) -> {
			System.out.println("Nota " + k +": "+v);
		});

	}
	
	// Qual tipo de retorno? Como organizar alunos por nota?
	public Map alunosPorNotaComString(List<Aluno> alunos) {
		// Nota 10: Alice, Arthur
		// Nota 9: Cassiane, Karina
		// Nota 8: Samuel
		// Nota 7:
		// Nota 6: Jaqueline, Juliana, Jonathan, Jeferson
		Map<Integer, String> alunosMap = new HashMap<Integer, String>();
		for (Aluno aluno : alunos) {
			if(alunosMap.get(aluno.getNota()) != null) {
				alunosMap.put(aluno.getNota(), alunosMap.get(aluno.getNota()) + ", " + aluno.getNome());
			}else{
				alunosMap.put(aluno.getNota(), aluno.getNome());
			}
		}
		return alunosMap;
	}

	public Map alunosPorNotaComLista(List<Aluno> alunos) {
		Map<Integer, List<Aluno>> mapLista = new HashMap<>();

		List<Aluno> listaAluno = new ArrayList<>();

		for(Aluno aluno : alunos) {
			if(mapLista.containsKey(aluno.getNota())) {
				listaAluno = (mapLista.get(aluno.getNota()));
			} else {
				listaAluno = new ArrayList<>();
			}
			listaAluno.add(aluno);
			mapLista.put(aluno.getNota(), listaAluno);
		}
		return  mapLista;
	}
}
