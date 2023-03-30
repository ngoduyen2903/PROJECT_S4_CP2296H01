/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Employees;
import com.cusc.entities.Products;
import com.cusc.entities.Promotions;
import com.cusc.sessions.ProductsFacadeLocal;
import com.cusc.sessions.PromotionsFacadeLocal;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Future;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author odieng
 */
@Named(value = "promotionMB")
@RequestScoped
public class PromotionMB implements Serializable {

    @EJB
    private ProductsFacadeLocal productsFacade;

    @EJB
    private PromotionsFacadeLocal promotionsFacade;

    private Long proID;
    private Integer productID;
    private String promotionName;
    private Date proDate;
    private Integer discount;
    private double priceapplyPro;
    private String note;

    //
    private double priceAfterDiscount;
    private double price;

    @PostConstruct
    public void init() {
        priceAfterDiscount = 0;
    }

    public void loadPrice() {
        System.out.println("------------");
        System.out.println("------------1" + priceAfterDiscount);
        System.out.println("------------2" + price);

        priceAfterDiscount = Math.ceil(price - ((promotions.getDiscount() * price / 100)));
    }

    private Promotions promotions;

    public PromotionMB() {
        promotions = new Promotions();
    }

    public PromotionsFacadeLocal getPromotionsFacade() {
        return promotionsFacade;
    }

    public void setPromotionsFacade(PromotionsFacadeLocal promotionsFacade) {
        this.promotionsFacade = promotionsFacade;
    }

    public Long getProID() {
        return proID;
    }

    public void setProID(Long proID) {
        this.proID = proID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public double getPriceapplyPro() {
        return priceapplyPro;
    }

    public void setPriceapplyPro(double priceapplyPro) {
        this.priceapplyPro = priceapplyPro;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Promotions> showAlPromotion() {
        return promotionsFacade.findAll();
    }

    public String createPromotion() {
        Products product = productsFacade.find(productID);
        double priceAfterDiscount = Math.ceil(product.getUnitPrice() - ((promotions.getDiscount() * product.getUnitPrice() / 100)));
        promotions.setAmountApplyPromotion(priceAfterDiscount);
        promotions.setProductID(product);
        promotionsFacade.create(promotions);
        return "promotionList";
    }

    public Promotions getPromotions() {
        return promotions;
    }

    public void setPromotions(Promotions promotions) {
        this.promotions = promotions;
    }

    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
