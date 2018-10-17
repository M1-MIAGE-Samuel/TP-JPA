/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Client;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samue
 */
public class ClientDAO {
 
    
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
    
    public Client insertClient(int numClient, String nom, String prenom, Date date){
        em.getTransaction().begin();
        Client client = new Client();
        client.setNumClient(numClient);
        client.setNomClient(nom);
        client.setPrenomClient(prenom);
        client.setDateNaiss(date);
        em.persist(client);
        em.flush();         
        em.getTransaction().commit();
        return client;
    }

    public Client searchClient(int numClient){
        return em.find(Client.class, numClient);
    }    
    
    public void deleteClient(Client client){
        em.detach(client);
    } 
    
    public List<Client> listeClients(){ 
        List<Client> liste = em.createQuery("SELECT * FROM CLIENT GROUP BY NUMCLIENT").getResultList();
        return liste;
    }
    
    public void envoie()
	{
            em.flush();         
            em.getTransaction().commit();
            
        }
}
