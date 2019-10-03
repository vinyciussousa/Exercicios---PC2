package br.com.prog2.aula7.pct1;

import br.com.prog2.aula7.pct2.PessoaJuridica;

public class Cliente {
	public Integer codigo;
	private String nome;
	protected String endereço;
	String uf;
	private String cep;
	
	public String inserirCliente(){
		return"Cienteinserido";
	}
	
	public String atualizarCliente(){
		return"Cienteatualizado";
	}
	
	public void testarVisibilidade(){
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj =new PessoaJuridica();
		Cliente c = new Cliente();
		}
}
