package com.capitulo.dez.modificadorAbstract;

public class FormatadorModeloB extends FormatadorRecibo {
	private String simboloMoeda;
	
	public String getSimboloMoeda() { return simboloMoeda; }
	
	public void setSimboloMoeda(String simboloMoeda){
		this.simboloMoeda = simboloMoeda;
	}
	public String gerarRecibo(String nomeCliente, double valor,
			String data, String motivo){
	return "Recebemos de "+ nomeCliente +
			" o valor de " + this.getSimboloMoeda() + " " + valor +
			" referente a " + motivo + ". \n" +
			super.getNomeEmpresa() + ", " + data;
	}
}
