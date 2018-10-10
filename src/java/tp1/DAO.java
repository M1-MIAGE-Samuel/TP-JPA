package tp1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javax.persistence.*;

public class DAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManager");
    private EntityManager em = emf.createEntityManager();
    /*
    @PersistenceContext(unitName = "TP_BankManagerPU")
    private EntityManager em;
    */
    public void test()
	{
            em.getTransaction().begin();
            System.out.println("Démarrage de la persistance");
            
            BankBranch agence1 = new BankBranch();
            agence1.setAdresse("Paris");
            agence1.setCodeAgence(88888);
            
            BankBranch agence2 = new BankBranch();
            agence2.setAdresse("Lorient");
            agence2.setCodeAgence(99999);
            
            Client client1 = new Client();
            client1.setNumClient(12);
            client1.setNomClient("Barbier");
            client1.setPrenomClient("Thomas");
            Date dateNaiss1 = new Date(1997-02-15);
            client1.setDateNaiss(dateNaiss1);
            
            Client client2 = new Client();
            client2.setNumClient(14);
            client2.setNomClient("Kervarec");
            client2.setPrenomClient("Samuel");
            Date dateNaiss2 = new Date(1991-11-23);
            client2.setDateNaiss(dateNaiss2);
            
            Account compte1 = new Account();
            compte1.setNum_compte("12687046013");
            compte1.setLibelle("Compte perso (petit filou, tu vas payer ton coup)");
            compte1.setIBAN("FR1112223334441122334455667");
            compte1.setSolde(12530000);
            compte1.setClients(client1);
            //compte1.setClients(client2);
            compte1.setAgence(agence1);
            
            Account compte2 = new Account();
            compte2.setNum_compte("75632408610");
            compte2.setLibelle("Compte pro");
            compte2.setIBAN("FR1916543334445042334454867");
            compte2.setSolde(700000);
            compte2.setClients(client1);
            compte2.setAgence(agence1);
            
            Account compte7 = new Account();
            compte7.setNum_compte("06794236871");
            compte7.setLibelle("Compte perso");
            compte7.setIBAN("FR0032223334445562334455667");
            compte7.setSolde(12500);
            compte7.setClients(client2);
            compte7.setAgence(agence2);
            
            
            
            
            em.persist(agence1);
            em.persist(agence2);
            
            em.persist(client1);
            em.persist(client2);
            
            em.persist(compte1);
            em.persist(compte2);
            em.persist(compte7);
            
            em.detach(compte7);            
            em.detach(client2);
            
            em.flush();
            
            System.out.println("Persistance OK");
            
            em.getTransaction().commit();
            
        }
    
}
