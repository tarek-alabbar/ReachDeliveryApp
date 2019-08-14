package com.fdmgroup.reachdeliveryapp.Model.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * DBHandler
 */
public class DBHandler {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UsersDB");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public DBHandler ()
    {

    }

    public void startDbHandler(Object entity)
    {
        entityManager.getTransaction().begin();  
        entityManager.persist(entity);
        entityManager.getTransaction().commit();  
        entityManagerFactory.close();  
        entityManager.close();  
    }
    
}