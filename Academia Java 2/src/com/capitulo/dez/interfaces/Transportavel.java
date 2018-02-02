package com.capitulo.dez.interfaces;

public interface Transportavel {
	
	//public static final String UNIDADE_VOLUME = "cm3";
	public String UNIDADE_VOLUME = "cm3";
	public String UNIDADE_PESO = "kg";
	
	public double getVolume();
	public double getPeso();
	public int getEmpilhamentoMaximo();
	
	

}
