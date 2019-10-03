package br.com.prog2.trabalho3;

public class Aluno {
	Integer matricula;
	String nome;
	Double[] notas;
	
	public Aluno(Integer qtdNotas) {
		notas = new Double[qtdNotas];
	}
}
