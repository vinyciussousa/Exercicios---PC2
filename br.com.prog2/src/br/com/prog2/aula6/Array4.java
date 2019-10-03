package br.com.prog2.aula6;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		numeros[0] = 13;
		numeros[1] = 16;
		numeros[2] = 11;
		numeros[3] = 12;
		numeros[4] = 15;
		
		System.out.println("Sem ordenar");
		for (int i : numeros) {
			System.out.println(i);
		}
		
		Arrays.sort(numeros);
		System.out.println("Ordenado");
		for (int i : numeros) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.binarySearch(numeros, 11));
		
		int[] numeros1 = new int[6];
		int[] numeros2 = new int[6];
		
		Arrays.fill(numeros1, 45);
		Arrays.fill(numeros2, 45);
		
		
		
	}

}
