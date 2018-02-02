package LeituraEscritadeDados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste4GerenciadorUsuarios {

    public static Teste4SerializableBean getUsuario(String username) throws IOException {
        try {
            FileInputStream leitorArquivo = new FileInputStream(username + ".user");
            ObjectInputStream leitorObjetos = new ObjectInputStream(leitorArquivo);
            Teste4SerializableBean user = (Teste4SerializableBean) leitorObjetos.readObject();
            leitorObjetos.close();
            return user;
        } catch (IOException ex) {
            System.out.println("Erro ao recuperar as preferencia do usuario: ");
            Logger.getLogger(Teste4GerenciadorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe nao encontrada! ");
            Logger.getLogger(Teste4GerenciadorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        return null;
    }

    public static void addUsuario(Teste4SerializableBean user) throws IOException {
        FileOutputStream escritorArquivos;
        ObjectOutputStream escritorObjetos;

        try {
            String fileName = user.getUsername() + ".user";
            escritorArquivos = new FileOutputStream(fileName);
            escritorObjetos = new ObjectOutputStream(escritorArquivos);
            escritorObjetos.writeObject(user);
            escritorObjetos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao tentar serializar o usuario " + user.getUsername());
            Logger.getLogger(Teste4GerenciadorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }

}
