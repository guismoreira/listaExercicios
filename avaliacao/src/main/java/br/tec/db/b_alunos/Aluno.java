package br.tec.db.b_alunos;

import java.util.Objects;

public class Aluno {

	private String nome;
	private Integer nota;
	
	public Aluno(String nome, Integer nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNota() {
		return nota;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Aluno aluno = (Aluno) o;
		return Objects.equals(nome, aluno.nome) && Objects.equals(nota, aluno.nota);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
}
