package br.com.prog2.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int idade;
		String sexo;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite a idade: ");
		idade = Integer.parseInt(bf.readLine());
		System.out.println("Digite o sexo: ");
		sexo = bf.readLine();
		
	}
}
