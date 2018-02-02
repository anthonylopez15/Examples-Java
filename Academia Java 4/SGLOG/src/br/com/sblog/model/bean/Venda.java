package br.com.sblog.model.bean;

import br.com.sblog.model.bean.Cliente;
import java.util.Date;

public class Venda {
    
    
    private int codigo;
    private String pedido;
    private double valor;
    private String condicaoPgto;
    private String envioData;
    private Cliente empresa;

    public Venda(int codigo, String pedido, double valor, String condicaoPgto, String envioData, Cliente empresa) {
        this.codigo = codigo;
        this.pedido = pedido;
        this.valor = valor;
        this.condicaoPgto = condicaoPgto;
        this.envioData = envioData;
        this.empresa = empresa;
    }

    public Venda(int codigo) {
        this.codigo = codigo;
    }
    
    

    public Venda(String pedido) {
        this.pedido = pedido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCondicaoPgto() {
        return condicaoPgto;
    }

    public void setCondicaoPgto(String condicaoPgto) {
        this.condicaoPgto = condicaoPgto;
    }

    public String getEnvioData() {
        return envioData;
    }

    public void setEnvioData(String envioData) {
        this.envioData = envioData;
    }

    public Cliente getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Cliente empresa) {
        this.empresa = empresa;
    }
    
    
   
}
