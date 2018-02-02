package capitulo.um.ClassesUtilitarias.FormatadoresNumero;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestNumberFormat {

    public static void main(String[] args) {

        //Configuracao da localidade
        String idioma = "pt";
        String pais = "BR";
        Locale brasil = new Locale(idioma, pais);

        //criando os formatadores
        NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(brasil);
        NumberFormat formatadorMonetario = NumberFormat.getCurrencyInstance(brasil);
        NumberFormat formatadorercentual = NumberFormat.getPercentInstance(brasil);
        //configurando o numero minimo de casas decimais
        //formatadorNumerico.setMinimumFractionDigits(2);
        //formatando alguns valores
        double valor2 = 9000.9;
        System.out.println("numero: " + formatadorNumerico.format(1000));
        System.out.println("moeda: " + formatadorMonetario.format(valor2));
        System.out.println("percentagem: " + formatadorercentual.format(0.53));

        try {//para operacao aritmetica com Number precisa conversar a String.
            Number valor = formatadorNumerico.parse("100");
            String valorString = String.valueOf(valor);
            double valorDouble = valor2 + Double.parseDouble(valorString);
            System.out.println("numero lido: " + valorDouble);
        } catch (ParseException ex) {
            ex.getErrorOffset();
        }

    }
}
