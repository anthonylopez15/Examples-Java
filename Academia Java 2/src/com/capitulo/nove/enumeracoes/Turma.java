package com.capitulo.nove.enumeracoes;

public class Turma {

    private String curso;
    private Periodo periodo;

    public Turma(String curso, Periodo periodo) {
        this.setCurso(curso);
        this.setPeriodo(periodo);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public static void main(String[] args) {
        Turma t = new Turma("Academia do Java", Periodo.DIURNO_INTEGRAL);
        System.out.println("\t- Curso : " + t.getCurso());
        System.out.println("\t- Dias: " + t.getPeriodo().getDias());
        System.out.println("\t- Hora inicio: " + t.getPeriodo().getHoraInicio());
        System.out.println("\t- Hora Termino:" + t.getPeriodo().getHoraTermino());
    }
}
