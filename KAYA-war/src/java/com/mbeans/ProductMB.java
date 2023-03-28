/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Products;
import com.cusc.sessions.ProductsFacadeLocal;
import java.util.List;
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
    private ProductsFacadeLocal productsFacade;

    /**
     * Creates a new instance of ProductMN
     */
    public ProductMB() {
    }

    public List<Products> showAllProduct() {
        return productsFacade.findAll();
    }

}
