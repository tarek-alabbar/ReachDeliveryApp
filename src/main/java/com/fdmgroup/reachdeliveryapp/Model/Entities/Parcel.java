package com.fdmgroup.reachdeliveryapp.Model.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Parcel
 */
@Entity
@Table(name = "PARCEL")
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parcel_generator")
	@SequenceGenerator(name="parcel_generator", sequenceName = "parcel_seq", allocationSize=1)
    private Integer parcel_id;

    @Column
    private String tracking_number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Reach_users user;

    @ManyToOne()
    private City from;

    @ManyToOne()
    private City destination;

    @OneToOne
    private Status status;

    /**
     * @param parcel_id
     * @param tracking_number
     * @param from
     * @param destination
     * @param status
     * @param user
     */

    public Parcel(String tracking_number, City from, City destination, Status status, Reach_users user) {
        this.tracking_number = tracking_number;
        this.from = from;
        this.destination = destination;
        this.status = status;
        this.user = user;
    }

    @Override
    public String toString(){
        String output = "parcel_id: " + parcel_id + " tracking_number:  " + tracking_number + " from: " + from + 
                        " destination: " + destination + " status: " + status + " user: " + user;
        return output;
    }
    
    /**
     * 
     */

    public Parcel() {
    }

    
    /**
     * @return the parcel_id
     */
    public Integer getParcel_id() {
        return parcel_id;
    }

    /**
     * @param parcel_id the parcel_id to set
     */
    public void setParcel_id(Integer parcel_id) {
        this.parcel_id = parcel_id;
    }

    /**
     * @return the tracking_number
     */
    public String getTracking_number() {
        return tracking_number;
    }

    /**
     * @param tracking_number the tracking_number to set
     */
    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }


    /**
     * @return the from
     */
    public City getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(City from) {
        this.from = from;
    }

    /**
     * @return the destination
     */
    public City getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(City destination) {
        this.destination = destination;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the user
     */
    public Reach_users getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Reach_users user) {
        this.user = user;
    }

}