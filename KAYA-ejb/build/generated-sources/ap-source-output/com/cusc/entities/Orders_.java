package com.cusc.entities;

import com.cusc.entities.Customers;
import com.cusc.entities.Employees;
import com.cusc.entities.OrderDetails;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T13:16:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-27T22:11:38")
>>>>>>> Hung
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Integer> totalAmount;
    public static volatile SingularAttribute<Orders, String> note;
    public static volatile SingularAttribute<Orders, Integer> orderID;
    public static volatile SingularAttribute<Orders, BigDecimal> totalPrice;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, Customers> customerID;
    public static volatile SingularAttribute<Orders, String> paymentMethod;
    public static volatile SingularAttribute<Orders, Employees> employeeID;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, Integer> status;

}