package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="PHONE")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PHONE_ID")
	private Integer phone_id;
	
	
	@Column(name="PHONE_NO")
	private  String phone_no;
	
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="address_id")
	private Address address;


	public Integer getPhone_id() {
		return phone_id;
	}


	public void setPhone_id(Integer phone_id) {
		this.phone_id = phone_id;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
