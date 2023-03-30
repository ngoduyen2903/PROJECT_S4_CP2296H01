package com.cusc.entities;

import com.cusc.entities.Products;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T13:16:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-27T22:11:38")
>>>>>>> Hung
@StaticMetamodel(Promotions.class)
public class Promotions_ { 

    public static volatile SingularAttribute<Promotions, String> note;
    public static volatile SingularAttribute<Promotions, String> promotionName;
    public static volatile SingularAttribute<Promotions, Products> productID;
    public static volatile SingularAttribute<Promotions, Date> promotionDate;
    public static volatile SingularAttribute<Promotions, Integer> discount;
<<<<<<< HEAD
    public static volatile SingularAttribute<Promotions, Double> amountApplyPromotion;
    public static volatile SingularAttribute<Promotions, Long> promotionID;
=======
    public static volatile SingularAttribute<Promotions, BigDecimal> amountApplyPromotion;
    public static volatile SingularAttribute<Promotions, Integer> promotionID;
>>>>>>> Hung

}