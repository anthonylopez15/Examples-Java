package capitulo.um.ClassesUtilitarias.FormatadoresNumero;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestNumberFormat2 {

    public static void main(String[] args) {

        //Configuracao da localidade
        String idioma = "pt";
        String pais = "BR";
        Locale brasil = new Locale(idioma, pais);

        //criando os formatadores
        NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(brasil);
        NumberFormat formatadorMonetario = NumberFormat.getCurrencyInstance(brasil);
        //configurando o numero minimo de casas decimais
        formatadorNumerico.setMinimumFractionDigits(2);
        try {
            Number valorTela = formatadorNumerico.parse("100.500,50");
            String valorString = String.valueOf(valorTela);
            double valorDouble = Double.parseDouble(valorString);
            System.out.println("numero lido: " + valorDouble);
        } catch (ParseException ex) {
            Logger.getLogger(TestNumberFormat2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
