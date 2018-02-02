package com.capitulo.dez.modificadorAbstract;

public class FormatadorModeloA extends FormatadorRecibo {
	
	public String gerarRecibo(String nomeCliente, double valor,
								String data, String motivo){
		return "Nos da "+ super.getNomeEmpresa() +
				" recebemos de " + nomeCliente +
				" em " + data +
				" \no valor de R$ " + valor +
				" referente a " + motivo;
	}
}
