package com.capitulo.onze.polimorfismo;

public class TesteDynamicBindins {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f = new FuncionarioCLT();
		f.calculaPagamento();
		f = new FuncionarioPJ();
		f.calculaPagamento();

	}

}
