package capitulo.um.ClassesUtilitarias.Wrapper;

public class AutoBoxing {

    // AUTOBOXING COM EXCECAO
    static Integer x;

    static void gerarExcecao(int z) {
        int z2 = 5;
        System.out.println(z2 - z);
    }

    public static void main(String[] args) {

        // SEM AUTOBOXING
        int i = 10;
        Integer objetoI = new Integer(i);
        if (objetoI.intValue() == 10) {
            System.out.println("valor do Objeto igual a 10");
        }

        // COM AUTOBOXING
        int i2 = 10;
        Integer objeto = i2;
        if (objeto == 10) {
            System.out.println("valor do Objeto igual a 10");
        }

        // AUTOBOXING COM EXCECAO
        gerarExcecao(x);
    }

}
