<%-- 
    Document   : buscaUsuarios
    Created on : 10/01/2017, 02:26:56
    Author     : Anthony
--%>

<%@page import="util.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Usuario[] usuarios = (Usuario[]) request.getAttribute("usuarios");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>Usando o objeto implicito session (HttpSession)<br> 
                    Session ID: <%=session.getId()%>
                </td>
            </tr>
            <tr>
                <td>
                    Usando o objeto implicito application (ServletContext)
                    <br>
                    Server Info: <%=application.getServerInfo()%>
                </td>
            </tr>
            <tr>
                <td>Lista de usuario cadastrados no sistema</td>
            </tr>
            <tr>
                <td>
                    <table border="1">
                        <%for (Usuario usuario : usuarios) {%>
                        <table border="1">
                            <tr>
                                <td>Nome:</td>
                                <td><%=usuario.getNome()%></td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td><%=usuario.getEmail()%></td>
                            </tr>
                            <tr>
                                <td>Telefone:</td>
                                <td><%=usuario.getTelefone()%></td>
                            </tr>
                            <tr>
                                <td>Endereco:</td>
                                <td><%=usuario.getEndereco()%></td>
                            </tr>
                            <%}%>
                        </table>
                </td>
            </tr>
        </table>

    </body>
</html>
