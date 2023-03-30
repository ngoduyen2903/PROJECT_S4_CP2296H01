package com.cusc.entities;

import com.cusc.entities.OrderDetailsPK;
import com.cusc.entities.Orders;
import com.cusc.entities.Products;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T13:16:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-27T22:11:38")
>>>>>>> Hung
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, BigDecimal> unitPrice;
    public static volatile SingularAttribute<OrderDetails, OrderDetailsPK> orderDetailsPK;
    public static volatile SingularAttribute<OrderDetails, Integer> quantity;
    public static volatile SingularAttribute<OrderDetails, Orders> orders;
    public static volatile SingularAttribute<OrderDetails, Products> products;

}