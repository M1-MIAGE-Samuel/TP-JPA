/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import DAO.AgenceDAO;
import DAO.ClientDAO;
import DAO.CompteDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Model.Client;

/**
 *
 * @author samue
 */
@WebService(serviceName = "BankWS")
public class BankWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
   
    @WebMethod(operationName = "findClientById")
    public String findClientById(@WebParam(name= "idClient") int numClient){
        ClientDAO d = new ClientDAO();     
        Client c = d.searchClient(numClient);
        return "Client : " + c;
    }
    
    @WebMethod(operationName = "getAllClient")
    public List<Client> getAllClients(){
        ClientDAO d = new ClientDAO();
        return d.listeClients();
    }
    
    @WebMethod(operationName = "createBankBranch")
    public String createBankBranch(@WebParam(name= "codeAgence") int codeAgence, @WebParam(name="adresse") String adresse){
        AgenceDAO d = new AgenceDAO();
        try{
            d.insertAgence(adresse, codeAgence);
            return "Insertion réussie";
        }
        catch(Exception e){
            return "Echec de l'insertion";
        }
    }
    
    @WebMethod(operationName = "deleteAccount")
    public String deleteAccount(@WebParam(name = "num_compte") int num_compte){
        CompteDAO d = new CompteDAO();
        try{
            d.deleteCompte(d.searchAccount(num_compte));
            return "Suppression réussie";
        }
        catch(Exception e){
            return "Echec de la suppression";
        }
    }
           
}
