package com.capitulo.oito.sobrescrita;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Endereco edn1 = new Endereco("Rua das tulipas", 1222);
		
		Pessoa p = new Pessoa(edn1, "Maria da Silva", "1235770");
		p.imprime();
		
		System.out.println();
		
		Funcionario f = new Funcionario(edn1, "Anthony Lopez", "1233L", 
				12332, 4000, "22/10/1990");
		
		f.imprime();
	}

}
