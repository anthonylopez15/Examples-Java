package Genericos_EnhancedFor.Atividade;

import java.util.HashSet;
import java.util.Set;


public class TesteSetComGenerics {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf4");
		
		//a. Defini��o de uma cole��o de tipo HashSet usando Generics
		Set<Cliente> clientes = new HashSet<>();
                
		//b. Adi��o dos clientes na cole��o
                clientes.add(c1);
                clientes.add(c2);
                clientes.add(c3);
                clientes.add(c4);
                
		//c. Impress�o do nome dos clientes da cole��o
                for(Cliente cliente : clientes){
                    System.out.println(cliente.getNome());
                }
	}
}

