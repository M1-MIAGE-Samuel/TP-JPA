<%-- 
    Document   : affichageClient
    Created on : 12 oct. 2018, 14:45:09
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affichage Client</title>
    </head>
    <body>
        <h1>Informations Client</h1>
        
        <form action="${pageContext.request.contextPath}/Servlet" method="post">
        <div>
            <label>Numéro de client :</label>
            <input type="text" id="numClientInfo" name="numClientInfo">
        </div>
        <div>
            <input type="submit" name="submit" value="Afficher informations client"/>
        </div>
        </form>
    </body>
</html>
