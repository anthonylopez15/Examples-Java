package com.capitulo.dez.interfaces;

public abstract class AlimentoBase {
	
	private String nome;
	private int temperatura;
	private double volumeCm3;
	private int pesoGramas;
	
	public AlimentoBase(String nome, int temperatura, int gramas, double cm3){
		this.nome = nome;
		this.temperatura = temperatura;
		this.pesoGramas = gramas;
		this.volumeCm3 = cm3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public double getVolumeCm3() {
		return volumeCm3;
	}

	public void setVolumeCm3(double volumeCm3) {
		this.volumeCm3 = volumeCm3;
	}

	public int getPesoGramas() {
		return pesoGramas;
	}

	public void setPesoGramas(int pesoGramas) {
		this.pesoGramas = pesoGramas;
	}
	
	
}
