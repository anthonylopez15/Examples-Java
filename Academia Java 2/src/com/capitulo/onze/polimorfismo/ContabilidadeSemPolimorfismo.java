package com.capitulo.onze.polimorfismo;

public class ContabilidadeSemPolimorfismo {
	
	public void gerarDemostrativo(FuncionarioCLT func){
		System.out.println("O funcionario: " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
	}
	public void gerarDemostrativo(FuncionarioPJ func){
		System.out.println("o funcionario:" + func.getNome());
		System.out.println("Recebeu o pagamento de "+ func.calculaPagamento());
	}
}
