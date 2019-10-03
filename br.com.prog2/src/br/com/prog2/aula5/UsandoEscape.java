package br.com.prog2.aula5;

public class UsandoEscape {

	public static void main(String[] args) {
		testarBreak();
	}
	
	private static void testarReturn(int x, int y) {
		if(y == 0) {
			return;
		}
		System.out.println("x/y = "+(x/y));
	}
	
	private static void testarBreak() {
		for (int i = 0; i < 10; i++) {
			int valor = (int)(Math.random()*100);
				if (valor == 0) {
					break;
				}
				System.out.println(valor);
		}
		System.out.println("Programa terminou.");
	}
}
