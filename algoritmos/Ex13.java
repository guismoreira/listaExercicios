package listaExercicios;

// 13) Faça um método que calcule a média de um aluno de acordo
// com o critério definido neste curso. Além disso, faça um outro
// método que informe o status do aluno de acordo com a tabela a
// seguir:
// - Nota acima de 6: “Aprovado�?
// - Nota entre 4 e 6: “Verificação Suplementar�?
// - Nota abaixo de 4: “Reprovado�?
// mostrar nome do aluno

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Aluno{
    private String nome;
    private List<Double> notas;
    private Double media;
    private String status;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNota() {
        return this.notas;
    }

    public void setNota(List<Double> notas) {
        this.notas = notas;
    }

    public Aluno(){}
    public Aluno(String nome, List<Double> notas){
        this.nome = nome;
        this.notas = notas;
        calculaMedia();
        setStatus();
    }

    public Double getMedia() {
        return this.media;
    }
    public void calculaMedia() {
        Double notaTotal = 0.0;
        Integer count = 0;
        for(Double nota : this.notas){
            notaTotal += nota;
        }
        this.media = notaTotal / notas.size();
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus() {
        if(this.media > 6) {
            this.status = "Aprovado";
        } else if(this.media >= 4 && this.media <= 6){
            this.status = "Verificação suplementar";
        } else {
            this.status = "Reprovado";
        }

    }

    @Override
    public String toString() {
        return "Aluno " + getNome() + " com media " + getMedia() + " está " + getStatus() + "!!!";
    }



}


public class Ex13 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Double> notas = Arrays.asList(8.0,6.0,9.0);
        Aluno a1 = new Aluno("Jarbas", notas);

        // a1.setNota(notas);
        // a1.setNome("jarbas");
        // a1.calculaMedia();

        alunos.add(a1);

        System.out.println(a1);
    }
}
