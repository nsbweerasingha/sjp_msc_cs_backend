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
import com.neranjan.gscomp285.request.FlightRequest;
import com.neranjan.gscomp285.service.FlightService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.FLIGHT)
public class FlightController {
	@Autowired
	FlightService FlightService;
	
	@PostMapping(value = URIString.SAVE_FLIGHT)
	@Operation(summary = "SAVE Flight")
    public AppResponse<String> saveFlight(@RequestBody FlightRequest flightRequest) {
        
        try {
			this.FlightService.saveFlight(flightRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@PutMapping(value = URIString.UPDATE_FLIGHT)
	@Operation(summary = "UPDATE Flight")
    public AppResponse<String> updateFlight(@RequestBody FlightRequest flightRequest) {
        
        try {
			this.FlightService.updateFlight(flightRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@DeleteMapping(value = URIString.DELETE_FLIGHT)
	@Operation(summary = "DELETE Flight")
    public AppResponse<String> deleteFlight(@RequestBody FlightRequest flightRequest) {
        
        try {
			this.FlightService.deleteFlight(flightRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@GetMapping(value = URIString.GET_ALL_FLIGHT)
	@Operation(summary = "GET ALL Flight")
    public AppResponse<String> getAllFlight(@RequestBody FlightRequest flightRequest) {
        
        try {
			this.FlightService.getAllFlight(flightRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
	
	@GetMapping(value = URIString.GET_FLIGHT_BYID)
	@Operation(summary = "GET Flight BY ID")
    public AppResponse<String> getFlightByID(@RequestBody FlightRequest flightRequest) {
        
        try {
			this.FlightService.getFlightByID(flightRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "User authenticate successfully!", "");
    }
}
