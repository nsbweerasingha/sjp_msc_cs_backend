package com.neranjan.gscomp285.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.config.AppResponse;
import com.neranjan.gscomp285.request.BookingRequest;
import com.neranjan.gscomp285.service.BookingService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.BOOKING)
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@PostMapping(value = URIString.SAVE_BOOKING)
	@Operation(summary = "SAVE Booking")
    public AppResponse<String> saveBooking(@RequestBody BookingRequest bookingRequest) {
        
        try {
			this.bookingService.saveBooking(bookingRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@PutMapping(value = URIString.UPDATE_BOOKING)
	@Operation(summary = "UPDATE Booking")
    public AppResponse<String> updateBooking(@RequestBody BookingRequest bookingRequest) {
        
        try {
			this.bookingService.updateBooking(bookingRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@DeleteMapping(value = URIString.DELETE_BOOKING)
	@Operation(summary = "DELETE Booking")
    public AppResponse<String> deleteBooking(@RequestBody BookingRequest bookingRequest) {
        
        try {
			this.bookingService.deleteBooking(bookingRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@GetMapping(value = URIString.GET_ALL_BOOKING)
	@Operation(summary = "GET ALL Booking")
    public AppResponse<String> getAllBooking(@RequestBody BookingRequest bookingRequest) {
        
        try {
			this.bookingService.getAllBooking(bookingRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@GetMapping(value = URIString.GET_BOOKING_BYID)
	@Operation(summary = "GET Booking BY ID")
    public AppResponse<String> getBookingByID(@RequestBody BookingRequest bookingRequest) {
        
        try {
			this.bookingService.getBookingByID(bookingRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
}
