package com.capitulo.tres.encapsulamento.array;

public class TesteDepartamento {
	public static void main(String[] args){
		Pessoa p1 = new Pessoa();
		p1.setNome("Anthony");
		p1.setRg("1111");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Rayssa");
		p2.setRg("22222");
		
		//Criacao do array de pessoas para o departamento
		Pessoa[] pessoasDpto = {p1,p2};
		System.out.println("Tamanha inicial do Array : " + pessoasDpto.length);
		
		//Criacao do departamento
		Departamento d = new Departamento();
		d.setNome("Departamento de compras");
		d.setPessoas(pessoasDpto);;
		System.out.println("Departamento recen Criado");
		d.imprime();
		
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Rosa");
		novaPessoa.setRg("33333");
		d.addPessoa(novaPessoa);
		d.imprime();
		
		d.removePessoa(p2);
		d.imprime();
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Raquel");
		p3.setRg("33333");
		d.addPessoa(p3);
		d.imprime();
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Gustavo");
		p4.setRg("44444");
		d.addPessoa(p4);
		d.imprime();
	
		System.out.println("Procurando a pessoas com rg = 33333");
		Pessoa procura1 = d.getPessoa("33333");
		if(procura1 != null) 
			System.out.println(procura1.getNome());
		System.out.println("Prucarando a pessoa com rg = 555");
		Pessoa procura2 = d.getPessoa("555");
		if(procura2 != null)
			System.out.println(procura2.getNome());
		else
			System.out.println("Pessoa nao encontrada");
	}

}
