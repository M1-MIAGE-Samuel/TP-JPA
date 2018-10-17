<%-- 
    Document   : formulaireClient
    Created on : 12 oct. 2018, 10:21:18
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
             
        <h1> Inscription d'un nouveau client</h1>
    <form action="${pageContext.request.contextPath}/Servlet" method="post">
        <div>
            <label>Numéro de client :</label>
            <input type="text" id="numClient" name="numClient">
        </div>
        <div>
            <label>Nom :</label>
            <input type="text" id="nomClient" name="nomClient">
        </div>
        <div>
            <label>Prenom :</label>
            <input type="text" id="prenomClient" name="prenomClient">
        </div>
        <div>
            <label>Date de Naissance :</label>
            <input type="text" id="dateNaiss" name="dateNaiss">
        </div>
        <div>
            
            <input type="submit" name="submit" value="submitCreation"/>
        </div>
    </form>
    </body>
</html>
