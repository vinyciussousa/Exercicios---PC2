package br.com.prog2.aula8;

public class Carro implements Veiculo { 
	private int marcha; 
	private int velocidade; 
	public Carro(Integer marcha, Integer velocidade) { 
		this.marcha = marcha; 
		this.velocidade = velocidade; 
	} 
	
	@Override public void trocarMarcha(int marcha) { 
		this.marcha = marcha; 
	} 
	
	@Override public void aumentarVelocidade(int velocidade) { 
		this.velocidade += velocidade; 
	} 
	
	@Override
	public void aplicarFrenagem(int intensidade) { 
		this.velocidade -= intensidade; 
	} 
	public void mostraEstado() { 
		System.out.println("Velocidade: " + velocidade + "\nMarcha: " + marcha);
	}
	
}
