/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeStreamObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Anthony
 */
public class TesteGravacaoCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao da Silva", "11-8558-7447", "11232404-6", 1);
        String nomeArquivo1 = "Cliente" + cliente1.getCpf() + ".ser";
        FileOutputStream gravador = null;
        ObjectOutputStream gravadorObjetos = null;

        try {
            gravador = new FileOutputStream(nomeArquivo1);
            gravadorObjetos = new ObjectOutputStream(gravador);
            gravadorObjetos.writeObject(cliente1);
            
            System.out.println("Cliente gravado com sucesso!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // fechando os streams
            try {
                if (gravadorObjetos != null) {
                    gravadorObjetos.close();
                } else if (gravador != null) {
                    gravador.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
