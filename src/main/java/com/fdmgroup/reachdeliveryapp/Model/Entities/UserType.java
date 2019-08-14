package com.fdmgroup.reachdeliveryapp.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User_type
 */
@Entity
@Table(name = "USERS_TYPE")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_generator")
	@SequenceGenerator(name="type_generator", sequenceName = "type_seq", allocationSize=1)
    private Integer type_id;
    
    @Column
    private String description;

    @Override
    public String toString() {
        return "User Type ID: " + type_id + " User Type name: " + description;
    }

    /**
     * @param type_id
     * @param description
     */

    public UserType(String description) {
        this.description = description;
    }

    /**
     * 
     */

    public UserType() {
    }

    /**
     * @return the type_id
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     * @param type_id the type_id to set
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}