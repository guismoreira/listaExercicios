package br.tec.db;

import br.tec.db.b_alunos.Aluno;
import br.tec.db.b_alunos.AlunoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlunoServiceTest {

    AlunoService alunoService;
    List<Aluno> alunos;

    @BeforeEach
    public void inicializa(){
        alunoService = new AlunoService();

        alunos = Arrays.asList(
                new Aluno("jonas", 7),
                new Aluno("guilherme", 10),
                new Aluno("alberto", 7),
                new Aluno("andre", 10),
                new Aluno("will", 7),
                new Aluno("richard", 8));
        
    }

    @Test
    public void deveriaRetornarMapDeAlunos(){
        Map<Integer, String> mapAlunos = new HashMap<>();
        mapAlunos.put(7, "jonas, alberto, will");
        mapAlunos.put(10, "guilherme, andre");
        mapAlunos.put(8, "richard");

        Map<Integer, String> mapAlunosEsperados = alunoService.alunosPorNotaComString(alunos);

        assertEquals(mapAlunos, mapAlunosEsperados);

    }

    @Test
    public void deveriaRetornarMapDeAlunosComListaDeAlunos() {
        Map<Integer, List<Aluno>> mapAlunosEsperados = new HashMap<>();
        mapAlunosEsperados.put(7, Arrays.asList(new Aluno("jonas", 7),
                new Aluno("alberto", 7),new Aluno("will", 7)));
        mapAlunosEsperados.put(10, Arrays.asList(new Aluno("guilherme", 10),
                new Aluno("andre", 10)));
        mapAlunosEsperados.put(8, Arrays.asList(new Aluno("richard", 8)));

        Map<Integer, List<Aluno>> mapAlunos = alunoService.alunosPorNotaComLista(alunos);

        assertEquals(mapAlunosEsperados, mapAlunos);

    }
}
