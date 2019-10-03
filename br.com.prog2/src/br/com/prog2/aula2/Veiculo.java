package br.com.prog2.aula2;

public class Veiculo {
	String placa;
	String cor;
	Integer ano;
	Integer velocidade;
	String descricao;
	
	public Veiculo(String placa, String cor, Integer ano, String descricao) {
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.descricao = descricao;
		velocidade = 0;
	}
	
	public void aumentar() {
		velocidade = velocidade + 1;
	}
	
	public void diminuir() {
		velocidade = velocidade - 1;
	}

	public void parar() {
		velocidade = 0;
	}
}
