package br.com.prog2.aula6;

public class Array1 {
	
	public static void main(String[] args) {
		
		String[] listaAluno = new String[5];
		int idades[] = new int[5];
		
		listaAluno[0] = "Maria";
		
		idades[0] = 18;
		
		for (int i = 0; i < listaAluno.length; i++) {
			System.out.println("listaAluno["+i+"]: "+listaAluno[i]);
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("idades["+i+"]: "+idades[i]);
		}
		
	}
	
}
