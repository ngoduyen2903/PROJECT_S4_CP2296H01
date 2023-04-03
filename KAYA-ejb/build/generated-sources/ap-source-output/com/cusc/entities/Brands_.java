package com.cusc.entities;

import com.cusc.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T20:06:15")
@StaticMetamodel(Brands.class)
public class Brands_ { 

    public static volatile SingularAttribute<Brands, String> brandName;
    public static volatile SingularAttribute<Brands, String> website;
    public static volatile CollectionAttribute<Brands, Products> productsCollection;
    public static volatile SingularAttribute<Brands, Integer> brandID;
    public static volatile SingularAttribute<Brands, String> description;

}