package com.capitulo.tres.encapsulamento.array;

public class Departamento {
	private String nome;
	private Pessoa pessoas[];
	private int numeroPosicoesLivres = 0;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setPessoas(Pessoa[] pessoas){
		this.pessoas = pessoas;
	}
	public Pessoa[] getPessoas(){
		return pessoas;
	}
	public void addPessoa(Pessoa pessoa){
		System.out.println("Adicionando " + pessoa.getNome() + " ao departamento");
		if(numeroPosicoesLivres > 0){
			System.out.println("Existem possicoes livres no departamento " + numeroPosicoesLivres);			
			pessoas[pessoas.length - numeroPosicoesLivres] = pessoa;			
			numeroPosicoesLivres--;
		}else{
			System.out.println("Aumento a capacidade de pessoas do depto " + numeroPosicoesLivres);
			Pessoa[] novoArrayPessoas = new Pessoa[pessoas.length + 1];
			for(int i = 0; i < pessoas.length; i++){
				novoArrayPessoas[i] = pessoas[i];
			}
			novoArrayPessoas[novoArrayPessoas.length - 1] = pessoa;
			pessoas = novoArrayPessoas;
			System.out.println("Novo Tamanho do array: " + novoArrayPessoas.length);
		}
	}
	
	public Pessoa getPessoa(String rg){
		for(int i = 0;(i < pessoas.length - numeroPosicoesLivres); i++){
			if(pessoas[i].getRg().equals(rg)){
				return pessoas[i];
			}
		}
		return null;//retorna nulo se nao foi encotrada a pessoa
	}
	
	public Pessoa removePessoa(Pessoa p){
		String rgPessoa = p.getRg();
		int i = 0;
		while (i < pessoas.length - numeroPosicoesLivres){
			if (pessoas[i].getRg().equals(rgPessoa)){
				System.out.print("Indice "+i+" :");
				System.out.println("Pessoa a ser Removida= " +pessoas[i].getNome());
				//Indicar que a pessoa foi removida trazendo o ultimo elemento
				//do array para a posicao e colocando null na ultima posicao;				
				Pessoa pessoaRemovida = pessoas[i];
				pessoas[i] = pessoas[pessoas.length - 1 - numeroPosicoesLivres];
				pessoas[pessoas.length - 1 - numeroPosicoesLivres] = null;		
				
				numeroPosicoesLivres++;
				System.out.println(pessoaRemovida.getNome()+" Foi removido(a) do departamento");
				return pessoaRemovida;				
			}
			i++;
		}		
		return null;
	}
	
	public void imprime(){
		System.out.println("-----------------------------------");
		System.out.println("Departamento: " + nome);
		//É preciso garantir que o array de pessoas foi inicializado e por isso
		//é diferente de null, caso contratio podera ocorrer uma
		//NullPointerException
		if(pessoas != null){
			int i = 0;
			//É necessario garantir que as posicoes nao estao vazias,
			//e que esta sendo impressas posicoes invalidas,
			//ou seja, maiores do que o array
			while ((i < pessoas.length)){
				System.out.print("[" + i + "]\t");
				if (pessoas[i] != null){
					System.out.print(pessoas[i].getNome());
					System.out.println(" " + pessoas[i].getRg());
				}else{
					System.out.println("Posicao Livre");
				}
				i++;
			}
			System.out.println("tamanho de array na impressao: "+ pessoas.length);
		}else{
			System.out.println("Não há pessoas neste departamento");
		}
		System.out.println("-----------------------------------");
	}
}
