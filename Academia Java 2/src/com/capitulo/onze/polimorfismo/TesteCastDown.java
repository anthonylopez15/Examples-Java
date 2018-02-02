package com.capitulo.onze.polimorfismo;

public class TesteCastDown {
	public static void main(String[] args){
		Cliente c = new Cliente();
		
		//Cast UP de Cliente para Pessoa
		Pessoa p = c;
		
		//Cast DOWN de pessoa para cliente
		Cliente c2 = (Cliente) p;
		
		//Criação de uma instancia da classe Pessoa
		Pessoa p2 = new Pessoa();
		
		//Cast DOWN INVALIDO de Pessoa para Cliente
		Cliente c3 = (Cliente) p2;
	}
}
