package br.com.prog2.aula2;

public class Televisao { 
	//Atributos 
	private String descricao;
	//Visível apenas dentro da classe 
	Boolean ligada;//Visível dentro da classe e de outras classes dentro do pacote 
	//Construtor 
	public Televisao(String descricao) { 
		// this.descricao é o atributo 
		// descricao é a variável do método (no caso, construtor) 
		this.descricao = descricao; 
		ligada = false; 
	} 
	//Métodos 
	public void ligar(){ 
		ligada = true; 
	} 
	public void desligar(){ 
		ligada = false; 
	} 
	public String toString(){ 
		String estado = "desligada";//Visível apenas dentro do método 
		if(ligada){ estado = "ligada"; 
		} 
		//Visível apenas dentro do método 
		String retorno = "A televisão: "+descricao+" está "+estado;
		return retorno; 
	} 
	
	
}


