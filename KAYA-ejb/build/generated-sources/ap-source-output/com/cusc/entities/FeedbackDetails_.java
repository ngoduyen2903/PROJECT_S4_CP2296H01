package com.cusc.entities;

import com.cusc.entities.FeedbackDetailsPK;
import com.cusc.entities.Feedbacks;
import com.cusc.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-31T16:11:46")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-31T08:29:37")
>>>>>>> 98f9a8c78bde000eed89cf71ab918e1f1472b37e
@StaticMetamodel(FeedbackDetails.class)
public class FeedbackDetails_ { 

    public static volatile SingularAttribute<FeedbackDetails, String> feedbackContent;
    public static volatile SingularAttribute<FeedbackDetails, String> reviews;
    public static volatile SingularAttribute<FeedbackDetails, FeedbackDetailsPK> feedbackDetailsPK;
    public static volatile SingularAttribute<FeedbackDetails, Feedbacks> feedbacks;
    public static volatile SingularAttribute<FeedbackDetails, Products> products;

}