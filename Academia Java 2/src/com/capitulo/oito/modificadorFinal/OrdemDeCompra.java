package com.capitulo.oito.modificadorFinal;

public class OrdemDeCompra {
	public final Cliente cliente;
	
	public OrdemDeCompra(Cliente cliente){
		this.cliente = cliente;
	}
	public static void main(String[] args){
		Cliente cliente = new Cliente("Anthony lopez");
		OrdemDeCompra ordem = new OrdemDeCompra(cliente);
		
		
		ordem.cliente.setNome("Rayssa Miguela");
//		Cliente cliente2 = new Cliente("Rosita Reategui");
//		ordem.cliente = cliente2;
	
	}
}
