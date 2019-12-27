<%--
  Created by IntelliJ IDEA.
  User: cesardramirez
  Date: 12/26/19
  Time: 5:53 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int i = 0; %>
<html>
    <head>
        <title>Login Form</title>
        <link rel="stylesheet" type="text/css" href="css/platziweb.css">
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/login" method="post">
            <div class="table">
                <div class="row">
                    <div class="cell"><label>Usuario:</label></div>
                    <div class="cell"><input type="text" name="usuario"></div>
                    <div class="cell"><label>Clave:</label></div>
                    <div class="cell"><input type="password" name="clave"></div>
                    <div class="cell"><label>Empresa:</label></div>
                    <div class="cell"><input type="text" name="empresa"></div>
                </div>
                <div class="row">
                    <div class="cell"><input type="submit" value="Enviar"></div>
                </div>
            </div>
            <% for (i = 0; i < 10; i++) { %>
            <label>Hola <%= i %></label><br>
            <% } %>
        </form>
    </body>
</html>
