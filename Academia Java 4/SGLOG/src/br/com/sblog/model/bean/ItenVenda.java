package br.com.sblog.model.bean;

import br.com.sblog.model.bean.Venda;


public class ItenVenda {
    
    private Venda vendaCodigo;
    private String descricao;
    private int quantidade;
    private double preco;
    private int itenCodigo;
    
    
    public ItenVenda(Venda vendaCodigo, String descricao, int quantidade, double preco, int itenCodigo) {
        this.vendaCodigo = vendaCodigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.itenCodigo = itenCodigo;
    }

    public int getItenCodigo() {
        return itenCodigo;
    }

    public void setItenCodigo(int itenCodigo) {
        this.itenCodigo = itenCodigo;
    }
    

    public ItenVenda(Venda vendaCodigo) {
        this.vendaCodigo = vendaCodigo;
    }
    
    

    public Venda getVendaCodigo() {
        return vendaCodigo;
    }

    public void setVendaCodigo(Venda vendaCodigo) {
        this.vendaCodigo = vendaCodigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
           
    
}
