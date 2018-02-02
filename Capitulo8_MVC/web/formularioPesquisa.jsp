<%-- 
    Document   : formularioPesquisa
    Created on : 10/01/2017, 19:37:02
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Pesquisa</title>
    </head>
    <body>
        <% String msg = (String) request.getAttribute("msg"); %>
        <%if (msg == null) {
                out.println("");
            } else {
                out.println(msg);
            }
        %><br>
        Digite o sufixo do email dos usuarios desejado:
        <form name="formPesquisa" action="buscaUsuarios" method="post">
            <input type="text" name="sufixoEmail" />
            <input type="submit" value="Pesquisar" />
        </form>
    </body>
</html>
