
package capitulo.um.ClassesUtilitarias.Wrapper;

public class DemoConcatenacao {

    public static void main(String[] args) {
        //Lendo a quantidade de iteracoes da linha de comando
        int qtd = 10000;
        //currentTimeMillis() retorna um long com o numero de ms desde 01/01/1970
        long inicio = System.currentTimeMillis();
        concatenaString(qtd);
        //Captura o tempo final em ms
        long fim = System.currentTimeMillis();
        
        System.out.print("Classe String <====>");
        System.out.println("Tempo total de processamento: " + (fim-inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatenaStringBuffer(qtd);
        fim = System.currentTimeMillis();
        System.out.print("Classe StringBuffer <======>");
        System.out.println("Tempo total de processamento: " + (fim-inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatenaStringBuilder(qtd);
        fim = System.currentTimeMillis();
        System.out.print("Classe StringBuilder <======>");
        System.out.println("Tempo total de processamento: " + (fim-inicio) + "ms");
    }
    private static void concatenaString(int numConcatenacoes) {
        String s = "";
        for(int i = 0; i <= numConcatenacoes; i++){
            s = s + i;
        }
    }
    private static void concatenaStringBuffer(int numConcatenacoes) {
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i <= numConcatenacoes; i++){
            s.append(i);
        }
    }
    private static void concatenaStringBuilder(int numConcatenacoes) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i <= numConcatenacoes; i++){
            s.append(i);
        }
    }
}
