package com.vickee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("123")
	private int sid;
	@Value("Vickee")
	private String name;
	
	@Autowired
	private Address address;
	public Student() {
		super();
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
		
	}
	public Student(int sid, String name, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	public void display() {
		address.show();
	}

}
