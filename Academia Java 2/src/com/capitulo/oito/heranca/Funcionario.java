package com.capitulo.oito.heranca;

public class Funcionario extends Pessoa {
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;

	//{System.out.println("bloco de inicialização Funcionario");}
//	public Funcionario(Endereco endereco, String nome, String rg,
//			long carteira, double salario, String dataAdmissa){
		public Funcionario(Endereco endereco, String nome, String rg){
	super(endereco, nome, rg);
//	this.setCarteiraProfissional(carteira);
//	this.setSalario(salario);
//	this.setDataAdmissao(dataAdmissa);	
	//{System.out.println("Construtor Funcionario SUBCLASSE");}
	}
	public void imprime(){
		System.out.println("\n---------Imprimindo dados do Funcionario--------------");
		System.out.print("Eu " + super.nome + ", portador do Rg de n°: ");
		System.out.print(super.rg + " declaro que recebi o valor de R$ "+salario);
		System.out.print(" \nreferente ao meu pagamento do dia ");
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
