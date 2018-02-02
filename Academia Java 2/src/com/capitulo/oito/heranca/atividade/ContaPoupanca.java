package com.capitulo.oito.heranca.atividade;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */
public class ContaPoupanca extends Conta{
	private String dataAniversario;
	
	public ContaPoupanca(double saldo, String num, Cliente tit, Agencia ag, String dataAni){
		super(saldo, num, tit, ag);
		this.setDataAniversario(dataAni);
	}
	
	public void imprimeDados(){
		System.out.println("<<<<<<<Imprimindo Conta Poupança>>>>>>>");
		System.out.println("Data de Aniversario: " + this.getDataAniversario());
		super.imprimeDados();
		System.out.println("<<<<<<<------------------------->>>>>>>");
	}
	public void setDataAniversario(String dataAniversario){
		this.dataAniversario = dataAniversario;
	}
	public String getDataAniversario(){
		return dataAniversario;
	}
	
	
}
