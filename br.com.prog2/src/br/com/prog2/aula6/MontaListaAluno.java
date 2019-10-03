package br.com.prog2.aula6;

public class MontaListaAluno {

	public static void main(String[] args) {
		Aluno[] listaAlunos = new Aluno[5];
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a1.nome = "Maria";
		a1.idade = 26;
		a2.nome = "Maria";
		a2.idade = 26;
		a3.nome = "Maria";
		a3.idade = 26; 
		a4.nome = "Maria";
		a4.idade = 26;
		a5.nome = "Maria";
		a5.idade = 26;
		listaAlunos[0] = a1;
		listaAlunos[1] = a2;
		listaAlunos[2] = a3;
		listaAlunos[3] = a4;
		listaAlunos[4] = a5;
		
		//forma padrão do laço for
		for (byte i = 0; i < listaAlunos.length; i++) {
			System.out.println(listaAlunos[i]);
		}
		
		System.out.println();
		//usando for-each
		for (Aluno a : listaAlunos) {
			System.out.println(a);
		}
	}

}
