package capitulo.um.ClassesUtilitarias.Datas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TesteLocale {

    public static void main(String[] args) {
        Locale franca = Locale.FRANCE;
        Locale alemanha = Locale.GERMANY;
        Locale eua = Locale.US;
        Locale brasil = new Locale("pt", "BR");
        Locale[] variosLocais = {franca, alemanha, eua, brasil};

        Date data = new Date();
        System.out.println("data atual: " + data);

        for (int i = 0; i < variosLocais.length; i++) {
            Locale local = variosLocais[i];
            SimpleDateFormat formatador = new SimpleDateFormat("EEEE MMMM dd", local);
            System.out.println(formatador.format(data));

        }
    }
}
