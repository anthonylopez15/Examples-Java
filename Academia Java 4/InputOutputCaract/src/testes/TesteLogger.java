package testes;

public class TesteLogger {
    public static void main(String[] args) {
        Logger.log("Sera que funciona?");
        Logger.log("funciona sim...");
        Logger.log("Vamos gerar uma Exception para loga...");
        try {
            int x = 3 / 0;
        } catch (ArithmeticException e) {
            Logger.log(e);
        }
    }
}
