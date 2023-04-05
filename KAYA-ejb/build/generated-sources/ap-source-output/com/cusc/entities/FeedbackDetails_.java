package com.cusc.entities;

import com.cusc.entities.FeedbackDetailsPK;
import com.cusc.entities.Feedbacks;
import com.cusc.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-04T16:39:16")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T20:06:15")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T22:58:05")
>>>>>>> c9263f5e9f69768f1ee88787fe1ef7a73bf02b86
>>>>>>> 231bdb9a24d414d90ee67cf5f40e19fe98124af5
@StaticMetamodel(FeedbackDetails.class)
public class FeedbackDetails_ { 

    public static volatile SingularAttribute<FeedbackDetails, String> feedbackContent;
    public static volatile SingularAttribute<FeedbackDetails, String> reviews;
    public static volatile SingularAttribute<FeedbackDetails, FeedbackDetailsPK> feedbackDetailsPK;
    public static volatile SingularAttribute<FeedbackDetails, Feedbacks> feedbacks;
    public static volatile SingularAttribute<FeedbackDetails, Products> products;

}