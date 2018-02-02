package com.capitulo.dez.interfaces;

public class GalaoDeCombustivel implements Inflamavel{
	
	private String nomeCombustivel;
	private double densidade;//em g/cm3
	private int temperaturaDeTransporte;
	
	public GalaoDeCombustivel(String nomeCombustivel, double densidade,
								int tempTransporte){
		this.nomeCombustivel = nomeCombustivel;
		this.densidade = densidade;
		this.temperaturaDeTransporte = tempTransporte;
	}
	
	public int getTemperaturaMaxima(){
		return (int) (temperaturaDeTransporte * 1.4d);
	}
	
	public double getVolume() { return 3785 ; } //1 galao = 3.785 L
	
	public double getPeso(){
		double pesoGramas = getVolume() * densidade;
		return pesoGramas / 1000;
	}
	public int getEmpilhamentoMaximo() { return 3; }
	
	public String getNomeCombustivel() { return nomeCombustivel; }
	public double getDensidade(){ return densidade; }
	public int getTemperaturaDeTransporte() { return temperaturaDeTransporte;}
}
