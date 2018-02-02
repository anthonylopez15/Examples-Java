package com.capitulo.dez.interfaces;

public class TesteInterface {

	public static void main(String[] args) {
		
		Mobilia mob = new Mobilia("mesa","Moveis Silva","madeira/formica/metal",
									115, 70, 90, 11);
		System.out.println("Mobilia: " + mob.getTipo());
		System.out.println("volume: " + mob.getVolume()
							+ Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + mob.getPeso()+Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento max: " + mob.getEmpilhamentoMaximo());
		System.out.println();
		
		Alimento junk = new Alimento("hamburger", -2, 350, 260d, 6, 30);
		System.out.println("Alimento: " + junk.getNome());
		System.out.println("Volume: " + junk.getVolume()+
							Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento max: " + junk.getTemperaturaDeConservacao()
							+ "C");
		System.out.println("Dias de validade: " + junk.getDiasDeValidade());
	}
}
