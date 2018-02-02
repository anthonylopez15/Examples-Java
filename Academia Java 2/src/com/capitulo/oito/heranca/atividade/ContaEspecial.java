package com.capitulo.oito.heranca.atividade;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(double saldo, String num, Cliente tit, Agencia ag, double limite){
		super(saldo, num, tit, ag);
		this.setLimite(limite);
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	public double getLimite(){
		return limite;
	}
	
	 public void saque(double valor) {
		 if(this.limite > valor){//if(saldo + limite > valor) saldo -= valor;
			 super.saque(valor);
		 }else{
			 System.out.println("Realizando saque de : " + valor);
			 System.out.println("Valor fora do Limite");
		 }
	 }
	
	public void imprimeDados(){
		System.out.println("--------Imprime Conta Especial--------");
		super.imprimeDados();
		System.out.println("Limite: R$" + this.getLimite());
		System.out.println("----------------------------------------");
	}
		
}
