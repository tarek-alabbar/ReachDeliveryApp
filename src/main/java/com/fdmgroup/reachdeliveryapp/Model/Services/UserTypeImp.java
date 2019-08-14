package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import javax.persistence.TypedQuery;

import com.fdmgroup.reachdeliveryapp.Model.Entities.UserType;

/**
 * UserTypeImp
 */
public class UserTypeImp implements Dao<UserType> {

    DBHandler dbHandler = new DBHandler();

    @Override
    public UserType Read(Integer UserTypeID) {

        UserType userType = dbHandler.entityManager.find(UserType.class, UserTypeID);
        return userType;
    }

    @Override
    public UserType Read(String description) {

        TypedQuery<UserType> query = dbHandler.entityManager
                .createQuery("SELECT u FROM UserType u WHERE u.description = :description", UserType.class);
        query.setParameter("description", description);
        return query.getSingleResult();
    }

    @Override
    public void Create(UserType t) {

    }

    @Override
    public void Update(UserType oldObject, UserType newObject) {

    }

    @Override
    public void Delete(UserType t) {

    }

    @Override
    public List<UserType> getAll() {
        return null;
    }
    
}