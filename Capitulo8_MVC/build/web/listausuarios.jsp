<%-- 
    Document   : listausuarios
    Created on : 10/01/2017, 19:30:04
    Author     : Anthony
--%>

<%@page import="java.util.List"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE USUARIOS</h1>
        <%
            List<Usuario> usuarios = (List<Usuario>) request.getAttribute("users");
            int i = 0;
            for (Usuario usuario : usuarios) {i++;
        %>
        Nome: <%=usuario.getNome()%><br>
        Endereco: <%=usuario.getEndereco()%><br>
        Telefone: <%=usuario.getTelefone()%><br>
        Email: <%=usuario.getEmail()%>
        <br><br>
        <%}%>
        <h3>Total de Usuarios: <%=i%></h3>
    </body>
</html>
