package com.capitulo.dez.modificadorAbstract;

public abstract class FormatadorRecibo {
	
	private String nomeEmpresa;
	
	public void setNomeEmpresa(String nomeEmpresa){
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String getNomeEmpresa(){
		return this.nomeEmpresa;
	}
	
	public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo);
		//return "metodo em construção...";
}