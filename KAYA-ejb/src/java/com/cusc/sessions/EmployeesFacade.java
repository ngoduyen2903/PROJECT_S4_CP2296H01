/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cusc.sessions;

import com.cusc.entities.Employees;
import com.cusc.entities.Employees_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author huynh
 */
@Stateless
public class EmployeesFacade extends AbstractFacade<Employees> implements EmployeesFacadeLocal {

    @PersistenceContext(unitName = "KAYA-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeesFacade() {
        super(Employees.class);
    }

    @Override
    public boolean checkLoginEmployee(String username, String password) {
        boolean flag = false;
        try {
            Query query = em.createQuery("select u from Employees u where u.username =:uname and u.password = :pword");
            query.setParameter("uname", username);
            query.setParameter("pword", password);
            query.getSingleResult();
            flag = true;
        } catch (NoResultException ex) {
            flag = false;
        }
        return flag;
    }

    @Override
    public Employees findByUsername(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root r = cq.from(Employees.class);
        cq.select(r);
        cq.where(cb.equal(r.get(Employees_.username), username));
        Query query = em.createQuery(cq);
        return (Employees) query.getSingleResult();
    }

    @Override
    public Long loginEmployee(String username, String password) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root r = cq.from(Employees.class);
        cq.select(cb.count(r.get(Employees_.username)));
        cq.where(cb.and(cb.equal(r.get(Employees_.username), username), cb.equal(r.get(Employees_.password), password)));
        Query query = em.createQuery(cq);
        return (Long) query.getSingleResult();
    }

    @Override
    public Employees loadByUsername(String username, String password) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root root = cq.from(Employees.class);
        cq.select(root);
        cq.where(cb.and(cb.equal(root.get("username"), username), cb.equal(root.get("status"), "1")));
        Query query = em.createQuery(cq);
        return (Employees) query.getSingleResult();
    }

}
