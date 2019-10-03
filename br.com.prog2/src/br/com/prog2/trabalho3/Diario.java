package br.com.prog2.trabalho3;

import javax.swing.JOptionPane;

public class Diario {

	public static void main(String[] args) {
		Integer qtdNotas;
		Integer qtdAlunos;
		
		String qtdAlunos1 = JOptionPane.showInputDialog("Digite a quantidade de alunos.");
		qtdAlunos = Integer.parseInt(qtdAlunos1);
		
		String qtdNotas1 = JOptionPane.showInputDialog("Digite a quantidade de notas a ser lida.");
		qtdNotas = Integer.parseInt(qtdNotas1);
		
		Aluno[] Alunos = new Aluno[qtdNotas];
		Integer variavel = qtdAlunos;
		
		for (int i = 0; i < qtdAlunos; i++) {
				Aluno aluno = new Aluno(qtdNotas);
				String matricula = JOptionPane.showInputDialog("Digite o número da matricula.");
				aluno.matricula = Integer.parseInt(matricula);
				if (aluno.matricula == 0) {
					qtdAlunos -= variavel;
					break;
				}
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno.");
				aluno.nome = nome;
				for (int j = 0; j < qtdNotas; j++) {
					String nota = JOptionPane.showInputDialog("Digite a nota "+(j+1)+"ª do aluno.");
					aluno.notas[j] = Double.parseDouble(nota);
				}
				Alunos[i] = aluno;
				variavel--;
		}
		
		Double[] MediaAluno = new Double[qtdAlunos];
		Double[] Medias = new Double[qtdNotas];
		Double MediaGeral = 0.0;
		Double SomaMedias = 0.0;
		
		Double Soma1 = 0.0;
		for (int i = 0; i < qtdAlunos; i++) {
			for (int j = 0; j < qtdNotas; j++) {
				Soma1 = Soma1 + Alunos[i].notas[j];
			}
			MediaAluno[i] = Soma1/qtdNotas;
			Soma1 = 0.0;
		}
		
		Double Soma2 = 0.0;
		for (int i = 0; i < qtdNotas; i++) {
			for (int j = 0; j < qtdAlunos; j++) {
				Soma2 = Soma2 + Alunos[j].notas[i];
			}
			Medias[i] = Soma2/qtdAlunos;
			Soma2 = 0.0;
		}
		
		for (int i = 0; i < qtdAlunos; i++) {
			SomaMedias = SomaMedias + MediaAluno[i];
		}
		
		MediaGeral = SomaMedias/qtdAlunos;
		
		String minhaSaida = "";
		String[] minhasNotas = new String[qtdAlunos];
		String[] minhasNotasGerais = new String[qtdNotas];
		String minhaSaidaNotasGerais = "";
		
		for (int i = 0; i < qtdAlunos; i++) {
			for (int j = 0; j < qtdNotas; j++) {
				if(j == 0) {
					minhasNotas[i] = "Nota "+(j+1)+": "+Alunos[i].notas[j]+" ";
				}
				else {
					minhasNotas[i] += "Nota "+(j+1)+": "+Alunos[i].notas[j]+" ";
				}
			}
		}
		
		for (int i = 0; i < qtdNotas; i++) {
				minhasNotasGerais[i] = "Media Nota "+(i+1)+": "+Medias[i]+"\n"; 
		}
		
		for (int i = 0; i < qtdNotas; i++) {
			if (i == 0) {
				minhaSaidaNotasGerais = minhasNotasGerais[i];
			} else {
				minhaSaidaNotasGerais += minhasNotasGerais[i];
			}
		}
		
		for (int i = 0; i < qtdAlunos; i++) {
			if (i < qtdAlunos - 1) {
				minhaSaida += "Matricula: "+Alunos[i].matricula+" "+"Nome: "+Alunos[i].nome+" "+minhasNotas[i]+" Media: "+MediaAluno[i]+"\n";
			} else {
				minhaSaida += "Matricula: "+Alunos[i].matricula+" "+"Nome: "+Alunos[i].nome+" "+minhasNotas[i]+" Media: "+MediaAluno[i]+"\n"+minhaSaidaNotasGerais+"Media Geral: "+MediaGeral;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, minhaSaida);
	
	}

}
