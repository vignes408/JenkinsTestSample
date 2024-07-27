package com.vickee.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("447")
	private int doorno;
	@Value("SS Nagar")
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorno, String city) {
		super();
		this.doorno = doorno;
		this.city = city;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", city=" + city + "]";
	}
	public void show() {
		System.out.println(doorno);
		System.out.println(city);
	}
}
