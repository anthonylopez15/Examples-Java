package capitulo.um.ClassesUtilitarias.Wrapper;

public class ComparacaoString {

    public static void main(String[] args) {
        if (args.length == 0) {
            String str1 = new String("GlobalCode");
            String str2 = new String("GlobalCode");

            //Utilizando o operador ==
            if (str1 == str2) {
                System.out.println("Strings sao iguais utilizando o operador ==");
            } else {
                System.out.println("String NAO sao iguais utilizando o operador ==");
            }
            //Utilizando o metodo equals(String str)
            if (str1.equals(str2)) {
                System.out.println("String sao iguais usando equals");
            } else {
                System.out.println("Strings NAO sao iguais usando equals");
            }
            //Utilizando o metodo equalsIgnoreCase(String str)
            if (str1.equalsIgnoreCase(str2)) {
                String msg = "String sao iguais utilizando equalsIgnoreCase";
                System.out.println(msg);
            } else {
                String msg = "Strings NAO sao iguais usando equalsIgnoreCase";
                System.out.println(msg);
            }
            //Utilizando o metodo compareto(String str) retorna 0 se for verdadeiro
            int dif = str1.compareTo(str2);
            if (dif == 0) {
                System.out.println("String sao iguais usando compareTo");
            } else {
                System.out.println("Strings NAO sao iguais usando compareTo");
            }
        }else{
            String msg = "Sintaxe correta: java ComparacaoString <str1> <str2>";
            int num = args.length;
            System.out.println(msg + " " + num );
        }
    }
}
