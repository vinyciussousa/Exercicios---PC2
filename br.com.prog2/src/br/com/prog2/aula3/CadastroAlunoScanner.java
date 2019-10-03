package br.com.prog2.aula3;

import java.util.Scanner;

import br.com.prog2.util.DataPadraoBrasil;

public class CadastroAlunoScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do Aluno: ");
		String nome = sc.nextLine();
		System.out.println("Digite a matricula do Aluno: ");
		String matricula = sc.nextLine();
		System.out.println("Digite o dia do Nascimento do Aluno: ");
		String dia = sc.nextLine();
		System.out.println("Digite o mes do Nascimento do Aluno: ");
		String mes = sc.nextLine();
		System.out.println("Digite o ano do Nascimento do Aluno: ");
		String ano = sc.nextLine();
		
		sc.close();
		
		Aluno aluno = new Aluno(0, ano, null);
		aluno.matricula = Integer.parseInt(matricula);
		aluno.nome = nome;
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		aluno.dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		
		System.out.println("Aluno: "+aluno.nome);
		System.out.println("Matricula: "+aluno.matricula);
		System.out.println("Dia de Nascimento: "+dataDeNascimento);
		
		
	}
}
