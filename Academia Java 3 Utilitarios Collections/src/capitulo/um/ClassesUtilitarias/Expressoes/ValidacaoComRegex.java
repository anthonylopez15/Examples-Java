
package capitulo.um.ClassesUtilitarias.Expressoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoComRegex {
    public static void main(String[] args) {
        String param = "ga@f.mo";
        if(validaEmail(param)){
            System.out.println(param + " eh um email valido");
        }else{
            System.out.println(param +" nao eh um email valido");
        }
        if(validaFormatoCpf(param)){
            System.out.println(param +" eh um cpf valido");
        }else {
            System.out.println(param +" nao eh um cpf valido");
        }
    }

    private static boolean validaEmail(String email) {
        return Pattern.matches("[A-Za-z0-9._-]+@([A-Za-z]+\\.)+[A-za-z]+", email);
    }

    private static boolean validaFormatoCpf(String cpf) {
        Pattern padraoCpf = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = padraoCpf.matcher(cpf);
        return matcher.matches();
    }
}
