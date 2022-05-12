package listaExercicios.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoService {
	
	// Qual tipo de retorno? Como organizar alunos por nota?
	public Object alunosPorNota(List<Aluno> alunos) {
		// Nota 10: Alice, Arthur
		// Nota 9: Cassiane, Karina
		// Nota 8: Samuel
		// Nota 7:
		// Nota 6: Jaqueline, Juliana, Jonathan, Jeferson
	
		Map<String, Integer> notaAlunos = new HashMap<>();
	
	
		for(String chave : notaAlunos.keySet()) {
			Integer val = notaAlunos.get(chave);
			System.out.println(chave + " = " + val);
		}
		return notaAlunos;
	}
}

