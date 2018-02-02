package com.capitulo.oito.sobrescrita;

public class TestaPessoaToString {

	public static void main(String[] args) {
		Endereco e = new Endereco("Av. Bernardino de Campos", 327);
		String nome = "Anthony Jesus";
		String rg = "3444LP";
		//Pessoa p = new Pessoa(e, "Anthony Lopez", "123322100");
		Funcionario f = new Funcionario(e, nome, rg, 34453, 3000, "12/23/1990");
		//System.out.println(p);
		f.imprime();
		System.out.println(f);
//		String texto = "Dados da Pessoa : \n" + p;
//		System.out.println(texto);
	}

}
