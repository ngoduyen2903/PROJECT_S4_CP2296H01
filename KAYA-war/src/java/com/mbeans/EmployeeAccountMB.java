/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.cusc.entities.Employees;
import com.cusc.sessions.EmployeesFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author odieng
 */
@Named(value = "employeeAccountMB")
@SessionScoped
public class EmployeeAccountMB implements Serializable {

    @EJB
    private EmployeesFacadeLocal employeesFacade;

    private boolean enabled = true;

    public EmployeeAccountMB() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String toggleEnabled(long id) {
        Employees emp = employeesFacade.find(id);
        if (emp.getStatus() == 0) {
            emp.setStatus(1);
        } else {
            emp.setStatus(0);
        }
        employeesFacade.edit(emp);
        return "employeeList";
    }

}
