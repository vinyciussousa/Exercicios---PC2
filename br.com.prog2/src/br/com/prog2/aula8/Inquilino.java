package br.com.prog2.aula8;

import java.time.LocalDate;

public class Inquilino extends Morador{
	private Integer tempoContrato;
	//get/set
	@Override
	public double calcularTaxaDeposito(int qtdeVolume) {
		return qtdeVolume*5.0;
	}
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDataNascimento(LocalDate dataDeNascimento) {
		// TODO Auto-generated method stub
		
	}
	public void setNumeroFilho(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setTempoContrato(int i) {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
