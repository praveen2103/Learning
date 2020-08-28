package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8945696242750503695L;

	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private Integer address_id;
	
	@Column(name="VILLAGE")
	private String village;
	
	@Column(name="DIST")
	private String dist;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PIN_NO")
	private Integer pin_no;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="person_id")
	private Person person;
	
	
	@OneToMany(mappedBy="address",cascade=CascadeType.ALL, fetch = FetchType.EAGER)  
	@JsonManagedReference
	private List<Phone> phone;
	 

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin_no() {
		return pin_no;
	}

	public void setPin_no(Integer pin_no) {
		this.pin_no = pin_no;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	





}
