package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_tbl")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String cusname;
	private String aadhar;
	private String dateoffly;
	private String destination;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bid, String cusname, String aadhar, String dateoffly, String destination) {
		super();
		this.bid = bid;
		this.cusname = cusname;
		this.aadhar = aadhar;
		this.dateoffly = dateoffly;
		this.destination = destination;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getDateoffly() {
		return dateoffly;
	}

	public void setDateoffly(String dateoffly) {
		this.dateoffly = dateoffly;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
}
