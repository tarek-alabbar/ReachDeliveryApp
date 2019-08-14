package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Reach_users;

/**
 * UsersImp
 */
public class UsersImp implements Dao<Reach_users> {

    DBHandler dbHandler = new DBHandler();

    @Override
    public void Create(Reach_users t) {
        dbHandler.startDbHandler(t);
    }

    @Override
    public Reach_users Read(Integer id) {
        Reach_users user = dbHandler.entityManager.find(Reach_users.class, id);
        return user;
    }

    @Override
    public Reach_users Read(String name) {
        return null;
    }

    @Override
    public void Update(Reach_users oldObject, Reach_users newObject) {
        dbHandler.entityManager.getTransaction().begin();

        oldObject.setName(newObject.getName());
        oldObject.setUsername(newObject.getUsername());
        oldObject.setPassword(newObject.getPassword());
        oldObject.setAddress(newObject.getAddress());
        oldObject.setUser_type(newObject.getUser_type());
        oldObject.setUsers_details(newObject.getUsers_details());

        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public void Delete(Reach_users t) {
        dbHandler.entityManager.getTransaction().begin();
        dbHandler.entityManager.remove(t);
        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public List<Reach_users> getAll() {
        return null;
    }

    
}