package com.cusc.entities;

import com.cusc.entities.Products;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T21:20:11")
@StaticMetamodel(Promotions.class)
public class Promotions_ { 

    public static volatile SingularAttribute<Promotions, String> note;
    public static volatile SingularAttribute<Promotions, String> promotionName;
    public static volatile SingularAttribute<Promotions, Products> productID;
    public static volatile SingularAttribute<Promotions, Date> promotionDate;
    public static volatile SingularAttribute<Promotions, Integer> discount;
    public static volatile SingularAttribute<Promotions, Double> amountApplyPromotion;
    public static volatile SingularAttribute<Promotions, Long> promotionID;

}