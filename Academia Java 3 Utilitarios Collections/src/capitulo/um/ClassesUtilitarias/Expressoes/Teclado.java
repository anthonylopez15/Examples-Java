package capitulo.um.ClassesUtilitarias.Expressoes;

import java.util.Scanner;

public class Teclado {

    public static String le() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
