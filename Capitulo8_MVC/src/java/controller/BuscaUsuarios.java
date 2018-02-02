
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GerenciadorUsuarios;
import model.Usuario;


public class BuscaUsuarios extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";
        try {
            //interpretando a requisicao
            String sufixoEmail = request.getParameter("sufixoEmail").trim();
            if(sufixoEmail == null || sufixoEmail.equals("")){
                //SELECIONANDO UM COMPONENTE VIEW E DESPACHANDO
                msg = "Campo obrigatório, digite alguma coisa.";
                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("/formularioPesquisa.jsp");
                rd.forward(request, response);
            }else{
                //acionando componentes model-------------------
                GerenciadorUsuarios ger = new GerenciadorUsuarios();
                List<Usuario> usuarios = ger.getUsuariosByEmail(sufixoEmail);
                //disponibilizando dados para os componentes views
                request.setAttribute("users", usuarios);
                //selecionando um componente view e depachando
                RequestDispatcher rd = request.getRequestDispatcher("/listausuarios.jsp");
                rd.forward(request, response);
            }
        } catch (IOException | ServletException e) {
            System.out.println("Erro ao obter usuarios " + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
