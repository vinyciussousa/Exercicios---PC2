package br.com.prog2.aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.prog2.util.DataPadraoBrasil;

public class CadastraAlunoBuff {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ir);
		
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite o nome do aluno: ");
		String nome = bf.readLine();
		System.out.println("Digite a matricula do aluno: ");
		String matricula = bf.readLine();
		System.out.println("Digite o dia do nascimento: ");
		String dia = bf.readLine();
		System.out.println("Digite o mes do nascimento: ");
		String mes = bf.readLine();
		System.out.println("Digite o ano do nascimento ");
		String ano = bf.readLine();
		
		bf.close();
		ir.close();
		
		Aluno aluno = new Aluno(0, ano, null);
		
		aluno.matricula = Integer.parseInt(matricula);
		aluno.nome = nome;
		//DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		aluno.dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		
		System.out.println("Aluno: "+aluno.nome);
		System.out.println("Matricula: "+aluno.matricula);
		System.out.println("Dia de Nascimento: "+aluno.dataDeNascimento);
		
	}
	
}
