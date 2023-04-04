package com.cusc.entities;

import com.cusc.entities.FeedbackDetails;
import com.cusc.entities.Products;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T20:06:15")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T22:58:05")
>>>>>>> c9263f5e9f69768f1ee88787fe1ef7a73bf02b86
@StaticMetamodel(Feedbacks.class)
public class Feedbacks_ { 

    public static volatile SingularAttribute<Feedbacks, Products> productID;
    public static volatile CollectionAttribute<Feedbacks, FeedbackDetails> feedbackDetailsCollection;
    public static volatile SingularAttribute<Feedbacks, Integer> feedbackID;
    public static volatile SingularAttribute<Feedbacks, Date> creationDate;

}