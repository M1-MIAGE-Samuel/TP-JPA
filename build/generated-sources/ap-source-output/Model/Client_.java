package Model;

import Model.Account;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T16:13:34")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Integer> numClient;
    public static volatile SingularAttribute<Client, String> prenomClient;
    public static volatile SingularAttribute<Client, Date> dateNaiss;
    public static volatile SetAttribute<Client, Account> accounts;
    public static volatile SingularAttribute<Client, String> nomClient;

}