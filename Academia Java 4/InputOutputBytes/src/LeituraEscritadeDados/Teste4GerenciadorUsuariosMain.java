package LeituraEscritadeDados;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste4GerenciadorUsuariosMain {

    public static void main(String[] args) {
        
        String[] argments = {"Global"};
        
        try {
            if (argments.length == 1) {
                String username = argments[0];
                Teste4SerializableBean user;
                user = Teste4GerenciadorUsuarios.getUsuario(username);
                System.out.println(user);
            } else if (argments.length == 3) {
                Teste4SerializableBean novoUsuario = new Teste4SerializableBean(argments[0], argments[1], argments[2]);
                Teste4GerenciadorUsuarios.addUsuario(novoUsuario);
            } else {
                System.out.println("sintaxe adequada <user>");
                System.out.println("Sintaxe adequada <user><password><idiama>");
            }//end else
        } catch (IOException ex) {
            Logger.getLogger(Teste4GerenciadorUsuariosMain.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
