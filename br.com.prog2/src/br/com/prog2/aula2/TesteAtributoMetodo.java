package br.com.prog2.aula2;

public class TesteAtributoMetodo{ 
	public static void main(String[] args) { 
		Televisao t = new Televisao("Samsung 43"); 
		t.ligar(); 
		System.out.println(t.toString());
		Veiculo um = new Veiculo("AAA0000", "Azul", 1999, "Novo");
		Veiculo dois = new Veiculo("AAA0001", "Preto", 1999, "Usado");
		um.aumentar();
		um.aumentar();
		um.aumentar();
		System.out.println(um.velocidade);
		um.diminuir();
		System.out.println(um.velocidade);
		um.parar();
		System.out.println(um.velocidade);
		dois.aumentar();
		dois.aumentar();
		System.out.println(dois.velocidade);
		dois.diminuir();
		System.out.println(dois.velocidade);
		dois.parar();
		System.out.println(dois.velocidade);
		} 
	}
