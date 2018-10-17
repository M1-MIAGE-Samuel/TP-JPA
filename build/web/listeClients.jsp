<%-- 
    Document   : listeClients
    Created on : 12 oct. 2018, 15:51:06
    Author     : samue
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Client"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank Manager</title>
    </head>
    <body>
        <h1>Liste des clients</h1>
        
        
            <%
            if(request.getAttribute("listClients") != null) {
                List<Client> listClients = (List<Client>) request.getAttribute("listClients"); 
            %>
            
            
                <table class="table table-striped table-bordered table-list">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em></th>
                        <th class="hidden-xs">ID</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                        <th>Date de Naissance</th>
                    </tr> 
                  </thead>
                  <tbody>
                      <%
                for (Client client: listClients) {
                %>
                          <tr>
                            <td align="center">
                              <a class="btn btn-warning"><em class="fas fa-edit"></em></a>
                              <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
                            </td>
                            <td class="hidden-xs"><%=client.getNumClient()%></td>
                            <td><%=client.getNomClient()%></td>
                            <td><%=client.getPrenomClient()%></td>
                            <td><%=client.getDateNaiss()%></td>
                          </tr>
                          <% } %>
                  </tbody>
                </table>
<% } %>
    </body>
</html>
