package br.com.prog2.aula3;

import javax.swing.JOptionPane;

import br.com.prog2.util.DataPadraoBrasil;

public class CadastraAlunoJOptionPane {
	
	public static void main(String[] args) {
		String matricula = JOptionPane.showInputDialog("Digite a matrícula");
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String dia = JOptionPane.showInputDialog("Digite o dia de nascimento");
		String mes = JOptionPane.showInputDialog("Digite o mes de nascimento");
		String ano = JOptionPane.showInputDialog("Digite o ano de nascimento");
		
		Aluno aluno = new Aluno(0, ano, null);
		aluno.matricula = Integer.parseInt(matricula);
		aluno.nome = nome;
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		aluno.dataDeNascimento = dataDeNascimento;
		
		JOptionPane.showMessageDialog(null, aluno);
		}
}
