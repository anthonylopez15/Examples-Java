package com.capitulo.quatro.sobrecarga;

public class CalculadoraAmbigua {

	public int soma(byte b1, byte b2){
		System.out.println("soma de byte");
		return b1 + b2;
	}
	public long soma(long lg1, long lg2){
		System.out.println("soma de long");
		return lg1+lg2;
	}
	public double soma(double d1, double d2){
		System.out.println("soma de double");
		return d1 + d2;
	}
	//Varargs e Sobrecarga
	public int soma(int... params){
		System.out.println("soma com varargs");
		int soma = 0;
		for(int i = 0; i < params.length; i++){
			soma += params[i];
		}
		return soma;
	}
	
	public static void main(String[] args){
		CalculadoraAmbigua calc = new CalculadoraAmbigua();
		calc.soma(24, 25);
		
		byte a = 24;
		byte b = 25;
		calc.soma(a, b);
		calc.soma((byte)24 , (byte)25);		
		
		calc.soma(24.0, 25.0);
		calc.soma(15,30,25);
	}	
}
