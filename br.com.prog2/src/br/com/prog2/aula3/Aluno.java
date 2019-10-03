package br.com.prog2.aula3;

import br.com.prog2.util.DataPadraoBrasil;

public class Aluno {
	Integer matricula;
	String nome;
	DataPadraoBrasil dataDeNascimento;
	
	public Aluno(int matricula, String nome, DataPadraoBrasil dataDeNascimento){ 
		this.matricula = matricula; 
		this.nome = nome; 
		this.dataDeNascimento = dataDeNascimento; 
	}
	
	public String toString() {
		return "Nome: "+nome+"\n"+"Matricula: "+matricula+"\n"+"Data de nascimento: "+dataDeNascimento;
	}
}
