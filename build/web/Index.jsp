<%-- 
    Document   : Index
    Created on : 12 oct. 2018, 13:40:43
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Buddy!</h1>
        
    <form action="${pageContext.request.contextPath}/Servlet" method="post">
        <input type="submit" name="submit" value="Creation Client" />
    </form>
        
    <form action="${pageContext.request.contextPath}/ServletClient" method="post">
        <input type="submit" name="submit" value="Liste Clients" />
    </form>

        
    
    </body>
</html>
