package com.example.tasksapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="CustomerOrder")
public class Order {
	
	@Id
	@GeneratedValue
	private Long id;
	private int noOfConReq;
	private String custId;
	private String custname;
	private String addresss;
	private String city;
	private String pin;
	private String country;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNoOfConReq() {
		return noOfConReq;
	}
	public void setNoOfConReq(int noOfConReq) {
		this.noOfConReq = noOfConReq;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Order( int noOfConReq, String custId, String custname, String addresss, String city, String pin,
			String country) {
		super();
		this.noOfConReq = noOfConReq;
		this.custId = custId;
		this.custname = custname;
		this.addresss = addresss;
		this.city = city;
		this.pin = pin;
		this.country = country;
	}
	public Order() {
		super();
	}

}
