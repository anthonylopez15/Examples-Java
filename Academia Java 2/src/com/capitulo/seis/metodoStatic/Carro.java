package com.capitulo.seis.metodoStatic;

public class Carro {
	private String fabricante;
	private String placa;
	private int velocidade;
	public static int velocidadeMaximaPermitida = 60;
	
	public Carro(String fabricante, String placa, int velocidade){
		this.fabricante = fabricante;
		this.placa = placa;
		this.velocidade = velocidade;
	}
	
	public String getFabricante(){
		return fabricante;
	}
	public void setFabricante(String fabricante){
		this.fabricante = fabricante;
	}
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public int getVelocidade(){
		return velocidade;
	}
	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}
	public void acelerar(int destaV){
		velocidade = velocidade + destaV;
	}
	public boolean ultrapassouLimite(){
		return velocidade > velocidadeMaximaPermitida;
	}
	
	public static void main(String[] args){
		System.out.println("Velocidade permitida : "+ Carro.velocidadeMaximaPermitida);
		//System.out.println(Carro.velocidadeMaximaPermitida);
		Carro c1 = new Carro("GM", "IBM1234", 50);
		Carro c2 = new Carro("Vols", "OPO9876", 42);
		
		c1.acelerar(16);
		c2.acelerar(30);
		
		System.out.print("Carro " + c1.placa + " ultrapassou? ");
		System.out.println(c1.ultrapassouLimite());
		
		System.out.print("Carro " + c2.placa + " ultrapassou? ");
		System.out.println(c2.ultrapassouLimite());
		
		Carro.velocidadeMaximaPermitida = 70;
		System.out.println("\nVelocidade maxima: "+ Carro.velocidadeMaximaPermitida);
		
		System.out.print("Carro " + c1.placa + " ultrapassou? ");
		System.out.println(c1.ultrapassouLimite());
		
		System.out.print("Carro " + c2.placa + " ultrapassou? ");
		System.out.println(c2.ultrapassouLimite());
	
	
	}
}
