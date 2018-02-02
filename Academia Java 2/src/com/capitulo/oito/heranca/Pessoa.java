package com.capitulo.oito.heranca;

public class Pessoa {
	protected String nome;
	protected String rg;
	protected Endereco endereco;
	
	//{System.out.println("bloco de inicialição de Pessoa(SUPER)");}
	Pessoa(Endereco end, String nome, String rg){
		//{System.out.println("Construtor de Pessoa");}
		this.setEndereco(end);
		this.setNome(nome);
		this.setRg(rg);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void imprime(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.print("Endereco: " + this.getEndereco().getRua());
		System.out.println(" , " + this.getEndereco().getNumero());
	}
	
	
	
}
