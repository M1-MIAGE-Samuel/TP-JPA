/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.BankBranch;
import Model.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samue
 */
public class AgenceDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManager");
    private EntityManager em = emf.createEntityManager();
    /*
    @PersistenceContext(unitName = "TP_BankManagerPU")
    private EntityManager em;
    */
    public void begin(){
    em.getTransaction().begin();
    System.out.println("Démarrage de la persistance");
    }
    
    public BankBranch insertAgence(String adresse, int code){
        em.getTransaction().begin();
        BankBranch agence = new BankBranch();
        agence.setAdresse(adresse);
        agence.setCodeAgence(code);
        em.persist(agence);
        em.flush();         
        em.getTransaction().commit();
        return agence;
    }
    
    
    public void deleteAgence(BankBranch agence){
        em.detach(agence);
    }
    
    

    
    public Client searchClient(int numClient){
        return em.find(Client.class, numClient);
    }
    
    public void envoie()
	{
            em.flush();         
            em.getTransaction().commit();
            
        } 
}
