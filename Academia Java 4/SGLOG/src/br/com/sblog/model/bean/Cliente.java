
package br.com.sblog.model.bean;


public class Cliente {
    
    private int codigo;
    private String nomeEmpresa;
    private String cnpj;

    public Cliente() {
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
    }
    

    public Cliente(int codigo, String nomeEmpresa, String cnpj) {
        this.codigo = codigo;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    public Cliente(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    

    
    
    
}
