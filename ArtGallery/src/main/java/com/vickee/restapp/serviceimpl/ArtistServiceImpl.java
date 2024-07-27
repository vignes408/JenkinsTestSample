package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Artist;
import com.vickee.restapp.repo.ArtistRepo;
import com.vickee.restapp.service.ArtistService;


@Service
public class ArtistServiceImpl implements ArtistService {
	
	@Autowired
	ArtistRepo repo;
	
	@Override
	public void addArtist(Artist art) {
		repo.save(art);
	}

	@Override
	public Artist getArtist(int aid) {
		Optional<Artist> artopt = repo.findById(aid);
		return artopt.orElse(null);
	}

	@Override
	public List<Artist> getAllArtist() {
		return repo.findAll();
	}

	@Override
	public void updateArtist(Artist art) {
		repo.save(art);

	}

	@Override
	public void deleteArtist(int aid) {
		repo.deleteById(aid);

	}

}