package com.mycompany.myapp.repository;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RepositoryBase {
    @PersistenceContext
    private EntityManager em;

    protected Session getCurrentSession() {
        return em.unwrap(Session.class);
    }
}
