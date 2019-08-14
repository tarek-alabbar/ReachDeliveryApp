package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import javax.persistence.TypedQuery;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Parcel;

/**
 * ParcelImp
 */
public class ParcelImp implements Dao<Parcel> {

    DBHandler dbHandler = new DBHandler();

    @Override
    public void Create(Parcel t) {
        dbHandler.startDbHandler(t);
    }

    @Override
    public Parcel Read(Integer id) {
        Parcel parcel = dbHandler.entityManager.find(Parcel.class, id);
        return parcel;
    }

    @Override
    public Parcel Read(String tracking_number) {
        TypedQuery<Parcel> query = dbHandler.entityManager
        .createQuery("SELECT t FROM Parcel t WHERE t.tracking_number = :tracking_number", Parcel.class);
        query.setParameter("tracking_number", tracking_number);
        return query.getSingleResult();
    }

    @Override
    public void Update(Parcel oldObject, Parcel newObject) {
        dbHandler.entityManager.getTransaction().begin();

        oldObject.setTracking_number(newObject.getTracking_number());
        oldObject.setUser(newObject.getUser());
        oldObject.setFrom(newObject.getDestination());
        oldObject.setDestination(newObject.getDestination());
        oldObject.setStatus(newObject.getStatus());

        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public void Delete(Parcel t) {
        dbHandler.entityManager.getTransaction().begin();
        dbHandler.entityManager.remove(t);
        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public List<Parcel> getAll() {
        return null;
    }
    
    
}