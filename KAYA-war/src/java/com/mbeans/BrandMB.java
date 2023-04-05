/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Brands;
import com.cusc.sessions.BrandsFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author huynh
 */
@Named(value = "brandMB")
@RequestScoped
public class BrandMB {

    @EJB
    private BrandsFacadeLocal brandsFacade;
    private Integer brandID;
    private String brandName;
    private String description;
    private String website;
    private Brands brands;

    public BrandMB() {
        brands = new Brands();
    }

    public List<Brands> showAllBrands() {
        return brandsFacade.findAll();
    }

    public String createBrands() {
        brandsFacade.create(brands);
        return "brandList";
    }

    public String deleteBrands(Integer id) {
        Brands d = brandsFacade.find(id);
        brandsFacade.remove(d);
        return "brandList";
    }

    public String editBrands(Integer id) {
        brands = brandsFacade.find(id);
        return "editBrand";
    }

    public String saveBrands() {
        brandsFacade.edit(brands);
        return "brandList";
    }

    public String showAddForm() {
        brands = new Brands();
        return "addBrand";
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public BrandsFacadeLocal getBrandsFacade() {
        return brandsFacade;
    }

    public void setBrandsFacade(BrandsFacadeLocal brandsFacade) {
        this.brandsFacade = brandsFacade;
    }
   
}
