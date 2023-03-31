/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Employees;
import com.cusc.sessions.EmployeesFacadeLocal;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.messageDestinationLinkType;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author odieng
 */
@Named(value = "employeeMB")
@RequestScoped
public class EmployeeMB {

    @EJB
    private EmployeesFacadeLocal employeesFacade;
    private Integer empID;
    private String fullname;
    private String username;
    private String password;
    private String address;
    private String phone;
    private String email;
    private String status;
    private Employees employees;

    

    public EmployeeMB() {
        employees = new Employees();
    }

    public String showProfile(String username) {
        employees = employeesFacade.findByUsername(username);
        Integer id = employees.getEmployeeID();
        employees = employeesFacade.find(id);
        empID = employees.getEmployeeID();
        return "profile";
    }

    public String saveUpdateEmployee() {
        employeesFacade.edit(employees);
        return "profile";
    }

    public List<Employees> showAllEmployee() {
        return employeesFacade.findAll();
    }

    public void showEmployeeDetails(Long id) {
        employees = employeesFacade.find(id);
        System.out.println("-----------------");
    }

    public String showEmployeeDetail_ver1(long id) {
        employees = employeesFacade.find(id);
        return "employeeList";
    }

    public String deleteEmployee(Long id) {
        employeesFacade.remove(employeesFacade.find(id));
        return "employeeList";
    }

    public String createEmployee() {
        employeesFacade.create(employees);
        return "employeeList";
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public EmployeesFacadeLocal getEmployeesFacade() {
        return employeesFacade;
    }

    public void setEmployeesFacade(EmployeesFacadeLocal employeesFacade) {
        this.employeesFacade = employeesFacade;
    }

    public Integer getEmployeeID() {
        return empID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.empID = employeeID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
