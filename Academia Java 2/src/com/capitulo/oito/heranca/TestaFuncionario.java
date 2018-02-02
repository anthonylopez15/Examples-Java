package com.capitulo.oito.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Endereco edn1 = new Endereco("Rua das tulipas", 1222);
		
		Funcionario f = new Funcionario(edn1, "Pedro Da Silva", "122355");
				
		f.setSalario(10000);
		f.setCarteiraProfissional(1234555);
		
		//f.imprimeRecibo(16, 4, 2005);
	}

}
