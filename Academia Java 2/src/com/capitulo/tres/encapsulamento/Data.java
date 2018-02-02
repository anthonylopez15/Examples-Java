package com.capitulo.tres.encapsulamento;

public class Data {

    int dia;
    int mes;
    int ano;

    int getAno() {
        return ano;
    }

    void setAno(int anoNovo) {
        ano = anoNovo;
    }

    int getDia() {
        return dia;
    }

    void setDia(int diaNovo) {
        dia = diaNovo;
    }

    int getMes() {
        return mes;
    }

    void setMes(int mesNovo) {
        mes = mesNovo;
    }

    boolean isAnoBissexto() {
        if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    void imprime() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
