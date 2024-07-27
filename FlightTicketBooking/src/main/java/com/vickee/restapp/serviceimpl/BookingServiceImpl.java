package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Booking;
import com.vickee.restapp.repository.BookingRepo;
import com.vickee.restapp.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepo repo;
	
	@Override
	public void addBooking(Booking book) {
		repo.save(book);	
	}

	@Override
	public Booking getBooking(int bid) {
		// TODO Auto-generated method stub
		Optional<Booking> bookopt = repo.findById(bid);
		return bookopt.orElse(null);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateBooking(Booking book) {
		// TODO Auto-generated method stub
		repo.save(book);
		
	}

	@Override
	public void deleteBooking(int bid) {
		// TODO Auto-generated method stub
		repo.deleteById(bid);
	}

}