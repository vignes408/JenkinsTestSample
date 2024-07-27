package com.vickee.demo.bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud90")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String sname;
	@Column
	private long mobile;
	@Column
	private String scity;
	@Column
	private long pin;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, long mobile, String scity, long pin) {
		super();
		this.id = id;
		this.sname = sname;
		this.mobile = mobile;
		this.scity = scity;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}

	
	
}
