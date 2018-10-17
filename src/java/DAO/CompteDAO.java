/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import Model.BankBranch;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samue
 */
public class CompteDAO {
      
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
    
    public void insertAccount(String numCompte, String libelle, String iban, int solde, BankBranch agence){
        em.getTransaction().begin();      
        Account compte = new Account();
        compte.setNum_compte(numCompte);
        System.out.println(numCompte);
        System.out.println(libelle);
        System.out.println(iban);
        compte.setLibelle(libelle);
        compte.setSolde(solde);
        compte.setIBAN(iban);
        compte.setAgence(agence);
        em.persist(compte);
        em.flush();         
        em.getTransaction().commit();
    }
    
    public void deleteCompte(Account compte){
        em.detach(compte);
    }   
    
    public Account searchAccount(int num_compte){
        return em.find(Account.class, num_compte);
    }
    
    public void envoie()
	{
            em.flush();         
            em.getTransaction().commit();
            
        }  
}
