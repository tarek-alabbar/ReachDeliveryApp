package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import javax.persistence.TypedQuery;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Status;

/**
 * StatusImp
 */
public class StatusImp implements Dao<Status> {

    DBHandler dbHandler = new DBHandler();

    public StatusImp() {

    }

    @Override
    public Status Read(String description) {

        TypedQuery<Status> query = dbHandler.entityManager
                .createQuery("SELECT s FROM Status s WHERE s.description = :description", Status.class);
        query.setParameter("description", description);
        return query.getSingleResult();
    }

    @Override
    public Status Read(Integer status_id) {

        Status status = dbHandler.entityManager.find(Status.class, status_id);
        return status;
    }

    @Override
    public void Create(Status t) {

    }

    @Override
    public void Update(Status oldObject, Status newObject) {

    }

    @Override
    public void Delete(Status t) {

    }

    @Override
    public List<Status> getAll() {
        return null;
    }

}