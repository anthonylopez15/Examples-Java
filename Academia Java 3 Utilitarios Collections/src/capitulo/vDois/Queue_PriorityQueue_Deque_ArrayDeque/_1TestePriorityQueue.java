
package capitulo.vDois.Queue_PriorityQueue_Deque_ArrayDeque;

import capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList.Cliente;
import capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList.ComparadorClienteQtdPedidos;
import java.util.PriorityQueue;
import java.util.Queue;

class _1TestePriorityQueue {
    
    public static void main(String[] args) {
        ComparadorClienteQtdPedidos comp = new ComparadorClienteQtdPedidos();
        
        //Queue - a interface foi intoduzida no Java 5, e é utilizada par gerenciar objetos como uma fila.
        //seguindo o conceito de FIFO
        
        //PrirityQueue - uma especializaçao da interface Queue é a classe PriorityQueue, q funciona como uma lista
        //ordenada que aceita objetos duplicados. Devido á caracteristica de ordenazao, as classes dos objetos armazenados
        //na colecao devem implementar a interface Comparable, ou devemos informar uma implementação de Comparator no contrutor
        //da colecao.
        Queue clientes = new PriorityQueue(11, comp);
        clientes.add(new Cliente(1, "Cliente 1", 205));
        clientes.add(new Cliente(2, "Globalcode", 43));
        clientes.add(new Cliente(3, "Cliente 02", 89));
        clientes.add(new Cliente(1, "Cliente 03", 20));
        while(!clientes.isEmpty()){
            System.out.println("Processando cliente:");
            System.out.println(clientes.poll());
        }
    }
}
