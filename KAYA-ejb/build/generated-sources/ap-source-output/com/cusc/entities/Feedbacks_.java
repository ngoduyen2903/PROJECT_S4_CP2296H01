package com.cusc.entities;

import com.cusc.entities.FeedbackDetails;
import com.cusc.entities.Products;
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
@StaticMetamodel(Feedbacks.class)
public class Feedbacks_ { 

    public static volatile SingularAttribute<Feedbacks, Products> productID;
    public static volatile CollectionAttribute<Feedbacks, FeedbackDetails> feedbackDetailsCollection;
    public static volatile SingularAttribute<Feedbacks, Integer> feedbackID;
    public static volatile SingularAttribute<Feedbacks, Date> creationDate;

}