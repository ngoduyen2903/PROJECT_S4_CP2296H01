/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Customers;
import com.cusc.entities.Employees;
import com.cusc.sessions.CustomersFacadeLocal;
import com.cusc.sessions.EmployeesFacadeLocal;
import com.cusc.sessions.OwnerFacadeLocal;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author odieng
 */
@Named(value = "loginMB")
@SessionScoped
public class LoginMB implements Serializable {

    @EJB
    private OwnerFacadeLocal ownerFacade;

    @EJB
    private CustomersFacadeLocal customersFacade;

    @EJB
    private EmployeesFacadeLocal employeesFacade;

    private LoginMB loginMB;

    private String username;
    private String password;
    private int statusLogin;

    public LoginMB() {
    }

    public void loginCustomer() throws IOException {
        long checkCustomer = customersFacade.getCountByUsernamePassword(username, password);
        if (checkCustomer > 0) {
            Customers customers = customersFacade.loadByUsername(username, password);
            if (customers.getStatus() != 0) {
                statusLogin = 4;
                FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/client/index.xhtml");
            }
        }
        statusLogin = 5;
        FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/client/login.xhtml");
    }

    public void processLogin() throws IOException {
        long checkEmployee = employeesFacade.getCountByUsernamePassword(username, password);
        long checkOwner = ownerFacade.getCountByUsernamePassword(username, password);
        if (checkEmployee > 0) {
            System.out.println(checkEmployee);
            Employees emp = employeesFacade.loadByUsername(username, password);
            if (emp.getStatus() != 0) {
                statusLogin = 1;
                FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/index.xhtml");
            }
        } else if (checkOwner > 0) {
            statusLogin = 2;
            FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/index.xhtml");
        } else {
            statusLogin = 3;
            FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/login.xhtml");
        }

    }

    public void checkLogin() throws IOException {
        System.out.println(statusLogin);
        if (statusLogin != 2) {
            //sau nay tra ve trang 403
            FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/login.xhtml");
        }
    }

    public void checkLogin1() throws IOException {
        System.out.println(statusLogin);
        if (statusLogin != 1) {
            //sau nay tra ve trang 403
            FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/login.xhtml");
        }
    }

    public void checkLoginAdminOwner() throws IOException {
        System.out.println(statusLogin);
        if (statusLogin != 1 && statusLogin != 2) {
            //sau nay tra ve trang 403
            FacesContext.getCurrentInstance().getExternalContext().redirect("/KAYA-war/faces/admin/login.xhtml");
        }
    }

    public LoginMB getLoginMB() {
        return loginMB;
    }

    public void setLoginMB(LoginMB loginMB) {
        this.loginMB = loginMB;
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

    public int getStatusLogin() {
        return statusLogin;
    }

    public void setStatusLogin(int statusLogin) {
        this.statusLogin = statusLogin;
    }

}
