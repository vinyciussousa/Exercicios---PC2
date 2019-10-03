package br.com.prog2.aula8;

import java.time.LocalDate;

public class PessoaFisica extends Cliente{
	private String cpf;
	private String rg;
	private String sexo;
	private LocalDate dataDeNascimento;
	
	public PessoaFisica(Integer codigo, String nome, String endereco, String uf,
			String cep, String cpf, String rg, String sexo, LocalDate dataDeNascimento) {
		super(codigo, nome, endereco, uf, cep);
		this.cpf =cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

	//TODO Criar os get/set para os atributos da classe
	
}
