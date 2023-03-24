/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusc.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author odieng
 */
@Embeddable
public class FeedbackDetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "FeedbackID")
    private int feedbackID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;

    public FeedbackDetailsPK() {
    }

    public FeedbackDetailsPK(int feedbackID, int productID) {
        this.feedbackID = feedbackID;
        this.productID = productID;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) feedbackID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeedbackDetailsPK)) {
            return false;
        }
        FeedbackDetailsPK other = (FeedbackDetailsPK) object;
        if (this.feedbackID != other.feedbackID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cusc.entities.FeedbackDetailsPK[ feedbackID=" + feedbackID + ", productID=" + productID + " ]";
    }
    
}
