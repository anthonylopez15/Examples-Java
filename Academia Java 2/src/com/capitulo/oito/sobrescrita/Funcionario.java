package com.capitulo.oito.sobrescrita;

public class Funcionario extends Pessoa {
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;

	//{System.out.println("bloco de inicialização Funcionario");}
	public Funcionario(Endereco endereco, String nome, String rg,
			long carteira, double salario, String dataAdmissa){
	super(endereco, nome, rg);
	this.setCarteiraProfissional(carteira);
	this.setSalario(salario);
	this.setDataAdmissao(dataAdmissa);	
	//{System.out.println("Construtor Funcionario SUBCLASSE");}
	}
	public void imprime(){
		System.out.println("\n---------Imprimindo dados do Funcionario--------------");
		super.imprime();
		System.out.println("Carteira Prossifional: " +carteiraProfissional);
		System.out.println("Salario: " + salario);
		System.out.println("Data de Admissao: " + dataAdmissao);
		System.out.println("\n------------------------------------------");
	}
	public long getCarteiraProfissional() {
		return carteiraProfissional;
	}
	public void setCarteiraProfissional(long carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
	}
