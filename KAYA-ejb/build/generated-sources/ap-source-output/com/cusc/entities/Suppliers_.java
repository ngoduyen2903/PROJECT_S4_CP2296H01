package com.cusc.entities;

import com.cusc.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-24T21:44:16")
@StaticMetamodel(Suppliers.class)
public class Suppliers_ { 

    public static volatile SingularAttribute<Suppliers, String> website;
    public static volatile SingularAttribute<Suppliers, Integer> supplierID;
    public static volatile SingularAttribute<Suppliers, String> phoneNumber;
    public static volatile SingularAttribute<Suppliers, String> address;
    public static volatile CollectionAttribute<Suppliers, Products> productsCollection;
    public static volatile SingularAttribute<Suppliers, String> companyName;
    public static volatile SingularAttribute<Suppliers, String> email;
    public static volatile SingularAttribute<Suppliers, Integer> status;

}