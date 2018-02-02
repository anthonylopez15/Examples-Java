package com.capitulo.tres.encapsulamento;

public class TestaProduto {

	public static void main(String[] args){
		Produto p = new Produto();
		p.valoresInicias(9.0, "Produto X", "Marca Y");
		p.imprime();
		p.aumentarPreco(10);
		p.setDescricao("Casual Class");
		p.setMarca("GlobalCode");
		p.imprime();
		p.alterarPreco(9.9);
		
		
	}
}
