package br.com.prog2.aula8;

import java.time.LocalDate;

public abstract class Morador {
	private String nome;
	private LocalDate dataNascimento;
	private Integer numeroFilho;
	public abstract double calcularTaxaDeposito(int qtdeVolume);
	//get/set
}
