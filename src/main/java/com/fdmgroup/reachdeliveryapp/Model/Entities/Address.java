package com.fdmgroup.reachdeliveryapp.Model.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * Address
 */
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_generator")
	@SequenceGenerator(name="address_generator", sequenceName = "address_seq", allocationSize=1)
    private Integer address_id;

    @Column
    private String  house_number;

    @Column
    private String  street;

    @Column
    private String  city;

    @Column
    private String  postcode;

    @OneToMany(mappedBy = "address")
    private List <Reach_users> users;


    /**
     * @param address_id
     * @param house_number
     * @param street
     * @param city
     * @param postcode
     */

    public Address(String house_number, String street, String city, String postcode) {
        this.house_number = house_number;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    
    @Override
    public String toString()
    {
        String output = String.format("Address ID: %d House Number: %s Street: %s City: %s Postcode: %s", 
                                        address_id, house_number, street, city, postcode);
        return output;
    }

    /**
     * 
     */

    public Address() {
    }
    
    
    /**
     * @return the address_id
     */
    public Integer getAddress_id() {
        return address_id;
    }

    /**
     * @param address_id the address_id to set
     */
    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    /**
     * @return the house_number
     */
    public String getHouse_number() {
        return house_number;
    }

    /**
     * @param house_number the house_number to set
     */
    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode the postcode to set
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }



}