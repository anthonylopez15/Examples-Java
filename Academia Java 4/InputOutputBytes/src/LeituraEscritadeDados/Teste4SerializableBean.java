package LeituraEscritadeDados;

import java.io.Serializable;

public class Teste4SerializableBean implements Serializable{
    
    private String username;
    transient private String password;
    private String idioma;

    public Teste4SerializableBean(String username, String password, String idioma) {
        this.username = username;
        this.password = password;
        this.idioma = idioma;
    }
    
    public boolean passwordOk(String password){
        return this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        String s = "-------------------   \n";
                s += "Username: " + this.username + "\n";
                s += "Password: " + this.password + "\n";
                s += "Idiamo: "+ this.idioma + "\n";
                s += "-------------------";
        return s;
    }
    
    
}
