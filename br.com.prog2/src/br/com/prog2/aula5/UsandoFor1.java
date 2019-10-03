package br.com.prog2.aula5;

public class UsandoFor1 {
	public static void main(String[] args) {
		/*
		 * for(byte i = 0; i < 10; i++) System.out.println("Iteração
		 */
		
		int x = 0;
		for (int i = 0; i < 10 || (x % 2) ==  0; i++) {
			System.out.println("i = "+i+"x = "+x);
			x++;
		}
	}
}
