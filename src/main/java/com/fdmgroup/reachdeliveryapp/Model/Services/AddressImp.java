package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Address;

/**
 * AddressImp
 */
public class AddressImp implements Dao<Address> {

    DBHandler dbHandler = new DBHandler();

    @Override
    public void Create(Address t) {

        dbHandler.startDbHandler(t);
    }

    @Override
    public Address Read(Integer address_id) {
        Address address = dbHandler.entityManager.find(Address.class, address_id);
        return address;
    }

    @Override
    public Address Read(String name) {
        return null;
    }

    @Override
    public void Update(Address oldAddress, Address newAddress) {

        dbHandler.entityManager.getTransaction().begin();

        oldAddress.setCity(newAddress.getCity());
        oldAddress.setHouse_number(newAddress.getHouse_number());
        oldAddress.setStreet(newAddress.getStreet());
        oldAddress.setPostcode(newAddress.getPostcode());

        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public void Delete(Address t) {
        dbHandler.entityManager.getTransaction().begin();
        dbHandler.entityManager.remove(t);
        dbHandler.entityManager.getTransaction().commit();
    }

    @Override
    public List<Address> getAll() {
        return null;
    }
    
}