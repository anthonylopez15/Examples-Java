package capitulo.vDois.Queue_PriorityQueue_Deque_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2TesteDeque {

    public static void main(String[] args) {
        //Deque - interface deque, é uma especializacao da interface Queue, que tambem tem as caracteristicas de uma fila
        //porem ela suporta remocao de objetos no final da fila(PILHA).
        
        //ArrayDeque implementa a interface Deque, que utiliza estrutura de dados interna um array. o tamanho de array
        //é alterado em tempo de execucao de acordo com a necessidade da lista. nao aceita Null, nao sincronizada
        //não é segura para acesso de dados de maneira simultanea em ambiente multi-tarefa.
        Deque nomes = new ArrayDeque();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        
        while(!nomes.isEmpty()){
            System.out.println(nomes.pollLast());
        }
    }
}
