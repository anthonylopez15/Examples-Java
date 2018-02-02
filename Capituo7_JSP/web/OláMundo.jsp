<%-- 
    Document   : OláMundo
    Created on : 10/01/2017, 02:06:50
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        Este é um for no JSP
        <%for(int x = 0; x < 10; x++){%>
        Valor de x é: <%=x%> <br>
        <%}%>
    
</html>
