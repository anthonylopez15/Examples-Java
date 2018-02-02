package com.capitulo.oito.modificadorFinal;

public class Pedido {
	
	public final static int NOVO = 1;
	public final static int APROVADO = 2;
	public final static int CANCELADO = 3;
		
	private final int codigo;
	private int status;
	
	public Pedido(int cod){
		this.codigo = cod;
		this.setStatus(Pedido.NOVO);
	}
	public void setStatus(int status){
		this.status = status;
	}
//	public void setCodigo(int codigo){
//		this.codigo = codigo;
//	}
	public int getCodigo(){
		return codigo;
	}
	public int getStatus(){
		return status;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
