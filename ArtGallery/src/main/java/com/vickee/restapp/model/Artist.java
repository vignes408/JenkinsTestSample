package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "art_tbl")
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String artistName;
	private String city;
	private String artType;
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(int aid, String artistName, String city, String artType) {
		super();
		this.aid = aid;
		this.artistName = artistName;
		this.city = city;
		this.artType = artType;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}
	
	
	
	
}
