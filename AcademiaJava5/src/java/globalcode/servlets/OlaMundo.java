package globalcode.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class OlaMundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Definindo qual o tipo do conteudo
        response.setContentType("text/html");
        //obtendo o canal de comunicacao com o cliente, neste caso, browser
        PrintWriter out = response.getWriter();
        //enviando os dados para o cliente
        out.println("<html>");
        out.println("<head><title>OlaMundo!</title></head>");
        out.println("<body>");
        out.println("<h1>OlaMundão</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
