/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusc.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author odieng
 */
@Entity
@Table(name = "Feedbacks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedbacks.findAll", query = "SELECT f FROM Feedbacks f")
    , @NamedQuery(name = "Feedbacks.findByFeedbackID", query = "SELECT f FROM Feedbacks f WHERE f.feedbackID = :feedbackID")
    , @NamedQuery(name = "Feedbacks.findByCreationDate", query = "SELECT f FROM Feedbacks f WHERE f.creationDate = :creationDate")})
public class Feedbacks implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CreationDate")
    //@Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @OneToMany(cascade = {CascadeType.ALL,CascadeType.REMOVE}, mappedBy = "feedbacks")
    private Collection<FeedbackDetails> feedbackDetailsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FeedbackID")
    private Integer feedbackID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private Products productID;

    public Feedbacks() {
    }

    public Feedbacks(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Feedbacks(Integer feedbackID, Date creationDate) {
        this.feedbackID = feedbackID;
        this.creationDate = creationDate;
    }

    public Integer getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }


    public Products getProductID() {
        return productID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedbackID != null ? feedbackID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedbacks)) {
            return false;
        }
        Feedbacks other = (Feedbacks) object;
        if ((this.feedbackID == null && other.feedbackID != null) || (this.feedbackID != null && !this.feedbackID.equals(other.feedbackID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Feedbacks{" + "feedbackID=" + feedbackID + ", creationDate=" + creationDate + ", productID=" + productID + '}';
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @XmlTransient
    public Collection<FeedbackDetails> getFeedbackDetailsCollection() {
        return feedbackDetailsCollection;
    }

    public void setFeedbackDetailsCollection(Collection<FeedbackDetails> feedbackDetailsCollection) {
        this.feedbackDetailsCollection = feedbackDetailsCollection;
    }


    
}
