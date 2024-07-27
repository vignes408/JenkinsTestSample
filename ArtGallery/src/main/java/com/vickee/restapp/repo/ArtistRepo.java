package com.vickee.restapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Integer> {

}
