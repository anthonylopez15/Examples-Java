package Genericos_EnhancedFor;

import java.util.Collection;

public class ClienteDAO implements IDataAccessObject<Cliente, Integer> {

    public ClienteDAO() {
    }

    @Override
    public void save(Cliente e) {
    }

    @Override
    public void delete(Cliente e) {
    }

    @Override
    public Collection<Cliente> readAll() {
        return null;
    }

    @Override
    public Collection<Cliente> readByPK(Integer key) {
        return null;
    }

}
