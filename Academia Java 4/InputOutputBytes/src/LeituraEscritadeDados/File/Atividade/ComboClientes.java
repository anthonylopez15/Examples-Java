/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraEscritadeDados.File.Atividade;

import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Anthony
 */
public class ComboClientes extends JComboBox {

    public ComboClientes() throws GlobalcodeException {
        this.reloadFromDatabase();
    }

    public void reloadFromDatabase() throws GlobalcodeException {
        ClientesDAO db = new ClientesDAOSerialization();
        List<Cliente> clientes = db.getAllClientes();
        this.removeAllItems();
        for (int i = 0; i < clientes.size(); i++) {
            this.addItem(clientes.get(i));
        }
    }
}
