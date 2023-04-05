/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Orders;
import com.cusc.sessions.OrdersFacadeLocal;
import javax.inject.Named;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author This PC
 */
@Named(value = "orderMB")
@RequestScoped
public class OrderMB {

    @EJB
    private OrdersFacadeLocal ordersFacade;

    private Orders orders;
    private Long orderID;
    private Long customerID;
    private Long employeeID;
    private Long totalAmount;
    private Long totalPrice;
    private String pay;
    private String note;
    private Long status;

    public OrderMB() {
        orders = new Orders();
    }

    public List<Orders> showAllOrders() {
        return ordersFacade.findAll();
    }

    public OrdersFacadeLocal getOrdersFacade() {
        return ordersFacade;
    }

    public void setOrdersFacade(OrdersFacadeLocal ordersFacade) {
        this.ordersFacade = ordersFacade;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
