package com.capitulo.dez.interfaces;

public class Alimento extends AlimentoBase implements Transportavel, Perecivel{
	
	private int empilhamentoMaximo;
	private int diasDeValidade;
	
	public Alimento(String nome, int temperatura, int gramas,
					double cm3, int empilhamento, int validade){
		super(nome, temperatura, gramas, cm3);
		this.empilhamentoMaximo = empilhamento;
		this.diasDeValidade = validade;
	}
	
	public double getVolume(){
		return super.getVolumeCm3();
	}
	public double getPeso(){
		return super.getPesoGramas()/1000;
	}
	public int getEmpilhamentoMaximo(){
		return this.empilhamentoMaximo;
	}
	public int getTemperaturaDeConservacao(){
		return super.getTemperatura();
	}
	public int getDiasDeValidade(){
		return this.diasDeValidade;
	}
	
}
