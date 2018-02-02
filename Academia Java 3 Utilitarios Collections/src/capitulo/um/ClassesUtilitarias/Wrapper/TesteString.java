package capitulo.um.ClassesUtilitarias.Wrapper;

public class TesteString {

    public static void main(String[] args) {

        String nome = "GlobalCode";
        char inicial = nome.charAt(0);
        System.out.println("Inicial = " + inicial);
        //SAIDA
        //Inicial = G;

        //concat - concatena duas string diferentes
        String nome1 = "Global";
        String nome2 = "code";
        String nome3 = nome1.concat(nome2);
        System.out.println("Nome: " + nome3);

        //indexOf - Retorna a posicao onde ocorre a string passada no parametro
        String nome4 = new String("Globalcode");
        int posicao = nome4.indexOf("code");
        System.out.println("Posicao: " + posicao);

        //toLowerCase - retorna a string em minuscula mas nao modifica a original
        String nome5 = "GLOBALCode";
        String minuscula = nome5.toLowerCase();
        System.out.println(minuscula);

        //trim retira os espacos em branco encontrados na esq ou direita mas nao modifica
        String nome6 = "  Globalcode ";
        String semEspaco = nome6.trim();
        System.out.println("String cm espac -" + nome6 + "-");
        System.out.println("String seem espac -" + semEspaco + "-");

        String nomeCompleto = "Anthony Jesus Lopez Santillan";

        TesteString t = new TesteString();

        System.out.println("So nome: " + t.primeiroNome(nomeCompleto));

    }

    public String primeiroNome(String nome) {
        int tamanho = nome.lastIndexOf(" ");
        System.out.println(tamanho);
        return nome.substring(0, tamanho);
    }
}
