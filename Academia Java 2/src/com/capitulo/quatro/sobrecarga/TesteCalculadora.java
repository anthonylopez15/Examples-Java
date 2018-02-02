package com.capitulo.quatro.sobrecarga;



public class TesteCalculadora {

	public int soma(int a, int b){
		return a + b;
	}
	public int soma(int a, int b, int c){
		int resultado = this.soma(a, b) + c;
		return resultado;		
	}
	public float soma(float a, float b){
		return a + b;
	}
	public long soma(int[] numeros){
		long resultado = 0;
		for(int i = 0; i < numeros.length; i++){
			resultado += numeros[i];
		}
		return resultado;
	}
	
	public static void main (String[] args){
		TesteCalculadora cal = new TesteCalculadora();
		System.out.println("1 + 9 = "+ cal.soma(1, 9));
		System.out.println("1 + 9.0F = "+ cal.soma(1, 9.0F));
		
		int num[] = {1,3,6};
		System.out.println("1 + 3 + 6 = "+ cal.soma(num));
	}
}

