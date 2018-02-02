
package Genericos_EnhancedFor;

import java.util.Collection;


public interface IDataAccessObject<Entidade, PrimaryKey> {
    
    public void save(Entidade e);
    
    public void delete(Entidade e);
    
    public Collection<Entidade> readAll();
    
    public Collection<Entidade> readByPK(PrimaryKey key);
}
