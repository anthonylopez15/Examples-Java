package com.capitulo.seis.metodoStatic;

public class CalculadoraStatica {
	public static int soma (int a, int b){
		return  a + b;
	}
	public static int soma(int a, int b, int c){
		int resultado = soma(a, b) + c;
		return resultado;
	}
	public static float soma(float a, float b){
		return a + b;
	}
	public static long soma(int[] numeros){
		long resultado = 0;
		for(int i = 0; i < numeros.length; i++){
			resultado += numeros[i];
		}
		return resultado;
	}

	public static void main(String[] args) {		
		System.out.println("1 + 9: " + CalculadoraStatica.soma(1, 9));
		System.out.println("1 + 3 + 6: " + CalculadoraStatica.soma(1, 3, 6));
		System.out.println("1 + 9.0F: " + CalculadoraStatica.soma(1, 9.0F));
		int[] num = {1, 3, 6};
		System.out.println("1 + 3 + 6: " + CalculadoraStatica.soma(num));

	}

}
