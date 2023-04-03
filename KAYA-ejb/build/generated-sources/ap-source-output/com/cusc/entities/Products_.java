package com.cusc.entities;

import com.cusc.entities.Brands;
import com.cusc.entities.Categories;
import com.cusc.entities.FeedbackDetails;
import com.cusc.entities.Feedbacks;
import com.cusc.entities.OrderDetails;
import com.cusc.entities.Promotions;
import com.cusc.entities.Suppliers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T20:06:15")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, Double> unitPrice;
    public static volatile SingularAttribute<Products, String> image;
    public static volatile SingularAttribute<Products, Integer> quantity;
    public static volatile SingularAttribute<Products, Suppliers> supplierID;
    public static volatile CollectionAttribute<Products, Promotions> promotionsCollection;
    public static volatile SingularAttribute<Products, Long> productID;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;
    public static volatile CollectionAttribute<Products, FeedbackDetails> feedbackDetailsCollection;
    public static volatile SingularAttribute<Products, String> description;
    public static volatile CollectionAttribute<Products, Feedbacks> feedbacksCollection;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, Integer> promotionStatus;
    public static volatile SingularAttribute<Products, Brands> brandID;
    public static volatile SingularAttribute<Products, Categories> categoryID;
    public static volatile SingularAttribute<Products, Integer> status;

}