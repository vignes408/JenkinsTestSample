package com.vickee.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop_tbl")
public class MobileShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String sname;
	private String sowner;
	private String location;
	private long mobile;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private RequestRepair request;

	public MobileShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileShop(int mid, String sname, String sowner, String location, long mobile, RequestRepair request) {
		super();
		this.mid = mid;
		this.sname = sname;
		this.sowner = sowner;
		this.location = location;
		this.mobile = mobile;
		this.request = request;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSowner() {
		return sowner;
	}

	public void setSowner(String sowner) {
		this.sowner = sowner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public RequestRepair getRequest() {
		return request;
	}

	public void setRequest(RequestRepair request) {
		this.request = request;
	}

	
}
