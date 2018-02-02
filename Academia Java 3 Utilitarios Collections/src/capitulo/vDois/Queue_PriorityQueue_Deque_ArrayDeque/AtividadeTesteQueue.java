
package capitulo.vDois.Queue_PriorityQueue_Deque_ArrayDeque;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AtividadeTesteQueue {
    /*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
     */
 /*
 * Dicas para realizar este laboratório:
 * 
 * metodo poll() - recupera e remove, retorna null se fila  vazia
 * metodo remove() - recupera e remove, NoSuchElementException se fila vazia
 *
 * metodo peek() - recupera e nao remove, retorna null se fila vazia
 * metodo element() - recupera e nao remove, NoSuchElementException se fila vazia
 * 
     */
    public static void main(String args[]) {
        Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
        Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
        Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
        Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");
        // a. Crie um objeto do tipo PriorityQueue.
        Queue clientes = new PriorityQueue();

        // b. Insira os clientes usando metodo offer(Object)
        clientes.offer(c1);
        clientes.offer(c2);
        clientes.offer(c3);
        clientes.offer(c4);
        
        imprimirQueue(clientes);

        // c. Recupere e remova o primeiro elemento (veja dicas acima)
        Cliente clienteRemovido = (Cliente) clientes.remove();
        System.out.println("Cliente Removido = " + clienteRemovido);
        imprimirQueue(clientes);

        // d. Recupere, sem remover, o primeiro elemento (veja dicas acima)
        Cliente clienteRecuperado = (Cliente) clientes.element();
        System.out.println("Cliente recuperado = " + clienteRecuperado);
        imprimirQueue(clientes);

    }

    public static void imprimirQueue(Queue clientes) {
        Iterator ponteiroClientes = clientes.iterator();
        while (ponteiroClientes.hasNext()) {
            System.out.println(ponteiroClientes.next());
        }
        System.out.println();
    }

}
