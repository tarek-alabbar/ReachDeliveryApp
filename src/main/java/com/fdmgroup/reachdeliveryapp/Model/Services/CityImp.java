package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import javax.persistence.TypedQuery;

import com.fdmgroup.reachdeliveryapp.Model.Entities.City;

/**
 * Cities
 */
public class CityImp implements Dao<City> {

    DBHandler dbHandler = new DBHandler();

    public CityImp() {

    }

    @Override
    public City Read(String city_name) {

        TypedQuery<City> query = dbHandler.entityManager
                .createQuery("SELECT c FROM City c WHERE c.city_name = :city_name", City.class);
        query.setParameter("city_name", city_name);
        return query.getSingleResult();
    }

    @Override
    public City Read(Integer city_id) {

        City city = dbHandler.entityManager.find(City.class, city_id);
        return city;
    }

    @Override
    public void Create(City t) {

    }

    @Override
    public void Update(City oldObject, City newObject) {

    }

    @Override
    public void Delete(City t) {

    }

    @Override
    public List<City> getAll() {
        return null;
    }
}