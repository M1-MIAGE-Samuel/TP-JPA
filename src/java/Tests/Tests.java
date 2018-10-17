/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import DAO.AgenceDAO;
import DAO.ClientDAO;
import DAO.CompteDAO;
import Model.Client;
import Model.BankBranch;
import java.util.Date;

/**
 *
 * @author samue
 */
public class Tests {
    
    public void test(){
    
    AgenceDAO agenceDao = new AgenceDAO();
    ClientDAO clientDao = new ClientDAO();
    CompteDAO compteDao = new CompteDAO();
    //dao.begin();
    BankBranch agence1 = agenceDao.insertAgence("Londres", 55569);
    BankBranch agence2 = agenceDao.insertAgence("Paris", 75013);
    Date dateNaiss1 = new Date(1997-02-15);
    Client client1 = clientDao.insertClient(1, "Barbier", "Thomas", dateNaiss1);
    Date dateNaiss2 = new Date(1991-11-23);
    Client client2 = clientDao.insertClient(2, "Kervarec", "Samuel", dateNaiss2);
    compteDao.insertAccount("12687046013", "Compte perso", "FR1112223334441122334455667", 95000, agence1);
    compteDao.insertAccount("75632408610", "Compte pro", "FR1916543334445042334454867", 70000, agence1);
    compteDao.insertAccount("06794236871", "Compte perso", "FR0032223334445562334455667", 1250, agence2);
    
    //dao.envoie(); 
    
    }
    
    
}
