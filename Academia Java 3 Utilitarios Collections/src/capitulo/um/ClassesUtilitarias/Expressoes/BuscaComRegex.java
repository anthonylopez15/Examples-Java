
package capitulo.um.ClassesUtilitarias.Expressoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BuscaComRegex {
    private static String texto = "O 2o colocado chegou as 11hh26m33s";
    public static void main(String[] args) {
        Pattern padrao = Pattern.compile("\\d+\\w+");//("\\d\\d") ("\\d") ("\\d\\dh\\d\\dm\\d\\ds") ("..h..m") ("\\d\\d[hms]") ("\\d+\\w") ("\\d+\\w+")
        Matcher matches = padrao.matcher(texto);
        while(matches.find()){
            System.out.println("Encontrei o valor '" + matches.group() + "' na posicao " + matches.start());
        }
    }
}
