package br.com.prog2.aula5;

/**
 * 
 * @author Marcos
 * @since 
 *
 */

public class Operador {
	public static void main(String[] args) {
		//Comentário de uma linha 
		/*Comentário de mais de uma linha
		 * 
		 * 
		 * */
		int a = 3;
		int b = 4;
		System.out.println("Antes de incrementar a ");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		int c = ++a + b;
		System.out.println("Depois de incrementar a ");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		
		c = a>b?a:b;
		System.out.println(c);
	}
}
