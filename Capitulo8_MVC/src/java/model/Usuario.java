
package model;

public class Usuario {

    private Integer id;
    private String nome;
    private String senha ;
    private String endereco;
    private String telefone;
    private String email;
    private boolean ativo = true;

    public Usuario(Integer id, String nome, String senha, String endereco) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
    }

   
    public Usuario(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
    
}
