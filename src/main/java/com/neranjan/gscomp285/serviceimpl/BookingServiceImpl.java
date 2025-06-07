package com.neranjan.gscomp285.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neranjan.gscomp285.entity.Bookings;
import com.neranjan.gscomp285.entity.build.BookingBuilder;
import com.neranjan.gscomp285.repository.BookingRepository;
import com.neranjan.gscomp285.request.BookingRequest;
import com.neranjan.gscomp285.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public Bookings saveBooking(BookingRequest bookingRequest) throws Exception {
		// TODO Auto-generated method stub
		BookingBuilder bookingBuilder = new BookingBuilder();
		Bookings bookings = new Bookings();
		bookings = bookingBuilder.buildCreateEntity(bookingRequest, bookings);
		Bookings BookingResponse = this.bookingRepository.save(bookings);
		
		return BookingResponse;
	}

	@Override
	public Bookings updateBooking(BookingRequest bookingRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bookings deleteBooking(BookingRequest bookingRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getAllBooking(BookingRequest bookingRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bookings getBookingByID(BookingRequest bookingRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
