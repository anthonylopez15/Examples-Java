package com.capitulo.nove.enumeracoes;

public class TesteMes {

    public static void main(String[] args) {
        Mes mes = Mes.JANEIRO;
        String mensagem = (mesFeriasEscolares(mes) ? " " : " nao ")
                + "eh mes de ferias escolares";
        System.out.println(mes + mensagem);

    }

    private static boolean mesFeriasEscolares(Mes mes) {
        switch (mes) {
            case DEZEMBRO:
            case JANEIRO:
            case FEVEREIRO:
            case JULHO:
                return true;
            default:
                return false;
        }
    }
}
