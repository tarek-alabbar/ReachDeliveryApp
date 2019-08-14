package com.fdmgroup.reachdeliveryapp.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Cities
 */
@Entity
@Table(name = "CITIES")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_generator")
	@SequenceGenerator(name="city_generator", sequenceName = "city_seq", allocationSize=1)
    private Integer city_id;
    
    @Column
    private String city_name;

    @Override
    public String toString()
    {
        return "City name: " + city_name + " City ID: " + city_id;
    }

    /**
     * @param city_id
     * @param city_name
     */

    public City(String city_name) {
        this.city_name = city_name;
    }

    /**
     * 
     */

    public City() {
    }

    /**
     * @return the city_id
     */
    public Integer getCity_id() {
        return city_id;
    }

    /**
     * @param city_id the city_id to set
     */
    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    /**
     * @return the city_name
     */
    public String getCity_name() {
        return city_name;
    }

    /**
     * @param city_name the city_name to set
     */
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

}