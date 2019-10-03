package br.com.prog2.aula6;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] numeros = {3,5,7,10,100,107,187};
		
		// Array com 3 linhas e 2 colunas
		int[][] tabelaNumeros = {{34,67},{90,89},{23,78}};
		
		int[] numeros1 = new int[90];
		/*for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = 10;
		}*/
		
		Arrays.fill(numeros1, 10);
		
		//System.out.println(numeros[6]);
		
		for (int i : numeros) {
			System.out.println(i);
		}

	}

}
