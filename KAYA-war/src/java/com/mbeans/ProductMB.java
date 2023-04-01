/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Customers;
import com.cusc.entities.Employees;
import com.cusc.entities.Products;
import com.cusc.sessions.CustomersFacadeLocal;
import com.cusc.sessions.EmployeesFacadeLocal;
import com.cusc.sessions.ProductsFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author odieng
 */
@Named(value = "productMB")
@RequestScoped
public class ProductMB {

    @EJB
    private EmployeesFacadeLocal employeesFacade;

    @EJB
    private CustomersFacadeLocal customersFacade;

    @EJB
    private ProductsFacadeLocal productsFacade;
    private Long proID;
    private String productName;
    private String description;
    private Long categoryID;
    private Long supplierID;
    private Long brandsID;
    private String unitPrice;
    private String image;
    private String quantity;
    private String promotionStatus;
    private String status;
    private Products products;

    /**
     * Creates a new instance of ProductMN
     */
    //test login
    @PostConstruct
    public void init() {
        //dau tien phai check customer
        Customers customer = customersFacade.loadByUsername("duyenngo", "duyengo");
        //tiep check mk =>> cai nay luc viet truy van co the dung chung nhung tui lo lam rieng
        if (customer != null) { //customer != null la da lay dc customer
            System.out.println("Login Customer ss");
        } else {
            Employees emp = employeesFacade.loadByUsername("duyenngo", "");
            if (emp != null) {
                System.out.println("Login Employee SS");
            }
        }
        //neu kh do cai if ow tren thi la login fail
        System.out.println("Login fail");
    }

    public ProductMB() {
        products = new Products();
    }

    public String showUpdate(Long id) {
        products = productsFacade.find(id);
        return "";
    }

    public String saveUpdateProducts() {
        productsFacade.edit(products);
        return "productList";
    }

    public String saveUpdateProductss() {
        products = null;
        return "addProduct";
    }

    public String deleteProducts(Long id) {
        productsFacade.remove(productsFacade.find(id));
        return "productList";
    }

    public String createProduct() {
        productsFacade.create(products);
        return "productList";
    }

    /**
     *
     * @return
     */
    public List<Products> showAllProduct() {
        return productsFacade.findAll();
    }

    public Long getProID() {
        return proID;
    }

    public void setProID(Long proID) {
        this.proID = proID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getsupplierID() {
        return supplierID;
    }

    public void setsupplierID(Long supplierID) {
        this.supplierID = supplierID;
    }

    public Long getbrandsID() {
        return brandsID;
    }

    public void setbrandsID(Long brandsID) {
        this.brandsID = brandsID;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public ProductsFacadeLocal getProductsFacade() {
        return productsFacade;
    }

    public void setProductsFacade(ProductsFacadeLocal productsFacade) {
        this.productsFacade = productsFacade;
    }

}
