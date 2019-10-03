package br.com.prog2.aula2;

public class Televisao { 
	//Atributos 
	private String descricao;
	//Vis�vel apenas dentro da classe 
	Boolean ligada;//Vis�vel dentro da classe e de outras classes dentro do pacote 
	//Construtor 
	public Televisao(String descricao) { 
		// this.descricao � o atributo 
		// descricao � a vari�vel do m�todo (no caso, construtor) 
		this.descricao = descricao; 
		ligada = false; 
	} 
	//M�todos 
	public void ligar(){ 
		ligada = true; 
	} 
	public void desligar(){ 
		ligada = false; 
	} 
	public String toString(){ 
		String estado = "desligada";//Vis�vel apenas dentro do m�todo 
		if(ligada){ estado = "ligada"; 
		} 
		//Vis�vel apenas dentro do m�todo 
		String retorno = "A televis�o: "+descricao+" est� "+estado;
		return retorno; 
	} 
	
	
}


