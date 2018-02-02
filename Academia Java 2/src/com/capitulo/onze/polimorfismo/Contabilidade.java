package com.capitulo.onze.polimorfismo;

public class Contabilidade {
	
	public void gerarDemostrativo(Funcionario func){
		System.out.println("O Funcionario: " + func.getNome());
		System.out.println("Recebeu o pagamento de "+ func.calculaPagamento());
	}
}
