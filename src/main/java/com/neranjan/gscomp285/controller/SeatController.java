package com.neranjan.gscomp285.controller;

import java.util.List;

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
import com.neranjan.gscomp285.entity.Seats;
import com.neranjan.gscomp285.request.SeatRequest;
import com.neranjan.gscomp285.service.SeatService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.SEATS)
public class SeatController {
	
	@Autowired
	SeatService seatService;
	
	@PostMapping(value = URIString.SAVE_SEATS)
	@Operation(summary = "SAVE Seats")
    public AppResponse<Seats> saveSeats(@RequestBody SeatRequest seatRequest) {
        
        try {
			this.seatService.saveSeats(seatRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", null);
    }
	
	@PutMapping(value = URIString.UPDATE_SEATS)
	@Operation(summary = "UPDATE Seats")
    public AppResponse<Seats> updateSeats(@RequestBody SeatRequest seatRequest) {
        
        try {
			this.seatService.updateSeats(seatRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", null);
    }
	
	@DeleteMapping(value = URIString.DELETE_SEATS)
	@Operation(summary = "DELETE Seats")
    public AppResponse<Seats> deleteSeats(@RequestBody SeatRequest seatRequest) {
        
        try {
			this.seatService.deleteSeats(seatRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", null);
    }
	
	@GetMapping(value = URIString.GET_ALL_SEATS)
	@Operation(summary = "GET ALL Seats")
    public AppResponse<List<Seats>> getAllSeats(@RequestBody SeatRequest seatRequest) {
        
        try {
			this.seatService.getAllSeats(seatRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", null);
    }
	
	@GetMapping(value = URIString.GET_SEATS_BYID)
	@Operation(summary = "GET Seats BY ID")
    public AppResponse<Seats> getSeatsByID(@RequestBody SeatRequest Seats) {
        
        try {
			this.seatService.getSeatsByID(Seats);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", null);
    }
}
