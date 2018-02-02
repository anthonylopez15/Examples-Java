package com.capitulo.onze.polimorfismo;

public class TesteCastUp {
	public static void main(String[] args){
		//o objeto c foi declarado e instanciado como cliente
		Cliente c = new Cliente();
		
		//Casting UP explicito do objeto da classe Cliente para classe P
		Pessoa p = (Pessoa) c;
		
		//Casting UP do objeto da classe cliente para classe Pessoa
		Pessoa p2 = c;
		
		//Casting UP do objeto da class Cliente para Pessoa
		Pessoa p3 = new Cliente();
		
		//Casting UP explicito do objeto da classe cliente para classe Object
		Object o = (Object) c;
		
		//Casting UP do objeto da classe Cliente para classe Object
		Object o2 = c;
		
		
		
	}
}
