package com.fdmgroup.reachdeliveryapp.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Status
 */
@Entity
@Table(name = "STATUS")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_generator")
	@SequenceGenerator(name="status_generator", sequenceName = "status_seq", allocationSize=1)
    private Integer status_id;
    
    @Column
    private String description;

    @Override
    public String toString()
    {
        return "Status ID: " + status_id + " Description: " + description;
    }
        /**
     * @param status_id
     * @param description
     */

    public Status(String description) {
        this.description = description;
    }

    /**
     * 
     */

    public Status() {
    }

    /**
     * @return the status_id
     */
    public Integer getStatus_id() {
        return status_id;
    }

    /**
     * @param status_id the status_id to set
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
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