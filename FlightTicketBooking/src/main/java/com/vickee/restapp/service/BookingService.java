package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Booking;

public interface BookingService {
	
	public void addBooking(Booking book);
	public Booking getBooking(int bid);
	List<Booking> getAllBooking();
	public void updateBooking(Booking book);
	public void deleteBooking(int bid);
}
