package br.com.prog2.aula8;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	public PessoaJuridica(Integer codigo, String nome, String endereco, String uf,
			String cep, String cnpj, String inscricaoEstadual, String razaoSocial) {
		super(codigo, nome, endereco, uf, cep);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
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
