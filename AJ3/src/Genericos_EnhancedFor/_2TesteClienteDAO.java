package Genericos_EnhancedFor;

import java.util.Collection;

public class _2TesteClienteDAO {

    public static void main(String[] args) {

        IDataAccessObject<Cliente, Integer> clienteDAO = new ClienteDAO();
        Collection<Cliente> listagem = clienteDAO.readAll();
        for (Cliente c : listagem) {
            //operacoes com o objeto cliente
        }
        
    }
}
