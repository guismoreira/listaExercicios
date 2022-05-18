package com.exemplo.tdd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario {
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	
	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		super();
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataAdmissao, nome, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(dataAdmissao, other.dataAdmissao) && Objects.equals(nome, other.nome)
				&& Objects.equals(salario, other.salario);
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario + "]";
	}
	
	
	
	
}
