/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.ClientDAO;
import Model.Client;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author samue
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String message = "Hello Buddy";
        request.setAttribute("test", message);
        this.getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
    }
    
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

            if(request.getParameter("submit").equals("Creation Client")){
                this.getServletContext().getRequestDispatcher("/formulaireClient.jsp").forward(request, response);
            }
            
            else if(request.getParameter("submit").equals("submitCreation")){
                //try{
                    int numClient = Integer.parseInt(request.getParameter("numClient"));
                    String nomClient = request.getParameter("nomClient");
                    String prenomClient = request.getParameter("prenomClient");
                    String dateString = request.getParameter("dateNaiss");
                    System.out.println(nomClient);
                    //Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
                    
                    try{
                        ClientDAO d = new ClientDAO();
                        Date date = new Date(1991-12-12);
                        d.insertClient(numClient, nomClient, prenomClient, date);
                        String message = "Création effectuée";
                        request.setAttribute("Résultat", message);
                        this.getServletContext().getRequestDispatcher("/formulaireClient.jsp").forward(request, response);
                        
                    }
                    catch(Exception e){
                        System.out.println("Erreur sur la fonction doPost()");
                    }
                    
                }
            else if(request.getParameter("submit").equals("Liste Clients")){
                this.getServletContext().getRequestDispatcher("/listeClients.jsp").forward(request, response);
            }
            
            else if(request.getParameter("submit").equals("Affichage Client")){
                this.getServletContext().getRequestDispatcher("/affichageClient.jsp").forward(request, response);
            }     
            
            else if(request.getParameter("submit").equals("Afficher informations client")){
                ClientDAO d = new ClientDAO();
                Client c = d.searchClient(Integer.parseInt(request.getParameter("numClientInfo")));
                System.out.println("--------------------------------------------------------------");
                System.out.println(Integer.parseInt(request.getParameter("numClientInfo")));
                System.out.println("--------------------------------------------------------------");
                String info = c.getNomClient() + " " + c.getPrenomClient();
                System.out.println(c.getNomClient());
                request.setAttribute("test", info);
                this.getServletContext().getRequestDispatcher("/affichageClient.jsp").forward(request, response);
                
            }

                //catch(ParseException ex){
                //    Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
                    
               // }
       
        //this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireClient.jsp").forward(request, response);
        
    }
}
    
//}
