package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Artist;

public interface ArtistService {
	
	public void addArtist(Artist art);
	public Artist getArtist(int aid);
	List<Artist> getAllArtist();
	public void updateArtist(Artist art);
	public void deleteArtist(int aid);
}
