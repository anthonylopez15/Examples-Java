package com.capitulo.onze.polimorfismo;

public class RelatorioPessoas {
	
	public void imprime(Pessoa p) {
		System.out.println("nome: " + p.getNome() + "\trg: " + p.getRg());
	}
	
	public int imprimeArray(Pessoa[] pessoas){
		int quantidadeImpressa = 0;
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i] == null) continue;
			imprime(pessoas[i]);
			quantidadeImpressa++;
                        
		}
		return quantidadeImpressa;
	}
}
