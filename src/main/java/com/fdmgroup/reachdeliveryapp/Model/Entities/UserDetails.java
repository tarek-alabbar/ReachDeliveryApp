package com.fdmgroup.reachdeliveryapp.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * Users_details
 */
@Entity
@Table(name = "USERS_DETAILS")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "details_generator")
	@SequenceGenerator(name="details_generator", sequenceName = "details_seq", allocationSize=1)
    private Integer details_id;

    @Column
    private String  phoneNumber;
    
    @Column
    private String  email;

    @Override
    public String toString()
    {
        String output = String.format("Details ID: %d phoneNumber: %s Email: %s", 
                                        details_id, phoneNumber, email);
        return output;
    }

        /**
     * @param details_id
     * @param phoneNumber
     * @param email
     */

    public UserDetails(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * 
     */

    public UserDetails() {
    }

    /**
     * @return the details_id
     */
    public Integer getDetails_id() {
        return details_id;
    }

    /**
     * @param details_id the details_id to set
     */
    public void setDetails_id(Integer details_id) {
        this.details_id = details_id;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}