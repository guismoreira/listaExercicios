package br.tec.db;

import br.tec.db.b_alunos.Aluno;
import br.tec.db.b_alunos.AlunoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
        mapAlunos.put(10, "george bush");

        Map<Integer, String> mapAlunosEsperados = alunoService.alunosPorNota(alunos);

        assertEquals(mapAlunos, mapAlunosEsperados);




        

    }
}
