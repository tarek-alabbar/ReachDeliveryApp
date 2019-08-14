package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import javax.persistence.TypedQuery;

import com.fdmgroup.reachdeliveryapp.Model.Entities.UserDetails;

/**
 * UserDetailsImp
 */
public class UserDetailsImp implements Dao<UserDetails> {

    DBHandler dbHandler = new DBHandler();

    @Override
    public UserDetails Read(Integer UserDetailsId) {
        UserDetails userDetails = dbHandler.entityManager.find(UserDetails.class, UserDetailsId);
        return userDetails;
    }

    @Override
    public UserDetails Read(String phoneNumber) {
        TypedQuery<UserDetails> query = dbHandler.entityManager
                .createQuery("SELECT p FROM UserDetails p WHERE p.phoneNumber = :phoneNumber", UserDetails.class);
        query.setParameter("phoneNumber", phoneNumber);
        return query.getSingleResult();
    }

    @Override
    public void Create(UserDetails t) {
        dbHandler.startDbHandler(t);
    }

    @Override
    public void Update(UserDetails oldDetails, UserDetails newDetails) {

        dbHandler.entityManager.getTransaction().begin();

        oldDetails.setEmail(newDetails.getEmail());
        oldDetails.setPhoneNumber(newDetails.getPhoneNumber());

        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public void Delete(UserDetails t) {

        dbHandler.entityManager.getTransaction().begin();
        dbHandler.entityManager.remove(t);
        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public List<UserDetails> getAll() {
        return null;
    }
    
    
}