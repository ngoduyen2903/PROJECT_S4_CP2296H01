package com.cusc.entities;

import com.cusc.entities.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-27T22:11:38")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> password;
    public static volatile SingularAttribute<Employees, String> address;
    public static volatile SingularAttribute<Employees, String> phoneNumber;
    public static volatile SingularAttribute<Employees, Integer> employeeID;
    public static volatile SingularAttribute<Employees, String> fullname;
    public static volatile CollectionAttribute<Employees, Orders> ordersCollection;
    public static volatile SingularAttribute<Employees, String> email;
    public static volatile SingularAttribute<Employees, String> username;
    public static volatile SingularAttribute<Employees, Integer> status;

}