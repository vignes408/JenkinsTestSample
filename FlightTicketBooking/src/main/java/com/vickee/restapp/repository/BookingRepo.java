package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
