
package model;

import java.util.List;

public class GerenciadorUsuarios {
    
    public List getUsuariosByEmail(String sufixo){
        UsuarioDAO dao = new UsuarioDAO();
        return dao.getUsuariosByEmail(sufixo);
    }
    
    public void cadastrarUsuario(Usuario u){
        
    }
    
    public void removerUsuario(Usuario u){
        
    }
}
