package com.cusc.entities;

import com.cusc.entities.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T13:16:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-27T22:11:38")
>>>>>>> Hung
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> password;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> phoneNumber;
    public static volatile SingularAttribute<Customers, Integer> customerID;
    public static volatile SingularAttribute<Customers, String> fullname;
    public static volatile SingularAttribute<Customers, String> avatar;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile SingularAttribute<Customers, String> email;
    public static volatile SingularAttribute<Customers, String> username;
    public static volatile SingularAttribute<Customers, Integer> status;

}