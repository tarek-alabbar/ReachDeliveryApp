package com.fdmgroup.reachdeliveryapp.Model.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "REACH_USERS")
public class Reach_users
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
	@SequenceGenerator(name="user_generator", sequenceName = "user_seq", allocationSize=1)
	private Integer	user_id;

	@Column
	private String	name;

	@Column
	private String username;

	@Column
	private String	password;

	@OneToOne
	private UserType user_type;

	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	@JoinColumn(name = "Parcel_id")
	private List<Parcel> parcels;

	@OneToOne
	private UserDetails users_details;

		/**
	 * @param user_id
	 * @param name
	 * @param username
	 * @param password
	 * @param user_type
	 * @param address
	 * @param users_details
	 */

	public Reach_users(String name, String username, String password, UserType user_type,
			Address address, UserDetails users_details) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.user_type = user_type;
		this.address = address;
		this.users_details = users_details;
	}

	@Override
    public String toString(){
        String output = "User ID: " + user_id + " - " + name + " - " + username + " - " + 
                        password + " - " + user_type + " - " + users_details;
        return output;
	}
	
	/**
	 * 
	 */

	public Reach_users() {
	}


	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the user_type
	 */
	public UserType getUser_type() {
		return user_type;
	}

	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(UserType user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the users_details
	 */
	public UserDetails getUsers_details() {
		return users_details;
	}

	/**
	 * @param users_details the users_details to set
	 */
	public void setUsers_details(UserDetails users_details) {
		this.users_details = users_details;
	}



}

