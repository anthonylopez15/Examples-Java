package br.com.sblog.model.bean;

import java.util.Date;

/**
 *
 * @author Anthony
 */
public class Usuario {

    private int codigo;
    private String nome;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;

    }

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

}
