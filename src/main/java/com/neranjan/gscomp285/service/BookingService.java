package com.neranjan.gscomp285.service;

import java.util.List;

import com.neranjan.gscomp285.entity.Bookings;
import com.neranjan.gscomp285.request.BookingRequest;

public interface BookingService {

	public Bookings saveBooking(BookingRequest bookingRequest) throws Exception;

	public Bookings updateBooking(BookingRequest bookingRequest) throws Exception;

	public Bookings deleteBooking(BookingRequest bookingRequest) throws Exception;

	public List<Bookings> getAllBooking(BookingRequest bookingRequest) throws Exception;

	public Bookings getBookingByID(BookingRequest bookingRequest) throws Exception;

}
