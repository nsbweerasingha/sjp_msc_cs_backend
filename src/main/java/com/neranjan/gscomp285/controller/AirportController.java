package com.neranjan.gscomp285.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.config.AppResponse;

import com.neranjan.gscomp285.request.AirportRequest;
import com.neranjan.gscomp285.response.AirportResponse;
import com.neranjan.gscomp285.response.list.AirportResponseList;
import com.neranjan.gscomp285.service.AirportService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.AIRPORT)
public class AirportController {

	@Autowired
	AirportService airportService;
	
	@PostMapping(value = URIString.SAVE_AIRPORT)
	@Operation(summary = "SAVE AIRPORT")
    public AppResponse<AirportResponse> saveAirport(@RequestBody AirportRequest airportRequest) {
		AirportResponse airportResponse = new AirportResponse();
        try {
        	airportResponse = this.airportService.saveAirport(airportRequest);
        	return new AppResponse<>(true, "Airport save successfully!", airportResponse);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airport save successfully!", airportResponse);
		}
        
    }
	
	@PutMapping(value = URIString.UPDATE_AIRPORT)
	@Operation(summary = "UPDATE AIRPORT")
    public AppResponse<AirportResponse> updateAirport(@RequestBody AirportRequest airportRequest) {
		AirportResponse airportResponse = new AirportResponse();
        try {
			this.airportService.updateAirport(airportRequest);
			return new AppResponse<>(true, "Airport save successfully!", airportResponse);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airport save successfully!", airportResponse);
		}
        
    }
	
	@DeleteMapping(value = URIString.DELETE_AIRPORT)
	@Operation(summary = "DELETE AIRPORT")
    public AppResponse<String> deleteAirport(@RequestParam("airportsAutoID") Long airportsAutoID) {
        
        try {
			this.airportService.deleteAirport(airportsAutoID);
			return new AppResponse<>(true, "Airport save successfully!", "");
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airport save successfully!", "");
		}
    }
	
	@GetMapping(value = URIString.GET_ALL_AIRPORT)
	@Operation(summary = "GET ALL AIRPORT")
    public AppResponse<AirportResponseList> getAllAirport() {
		AirportResponseList airportResponseList = new AirportResponseList();
        try {
        	airportResponseList = this.airportService.getAllAirport();
        	return new AppResponse<>(true, "Airport load successfully!", airportResponseList);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airport load successfully!", airportResponseList);
		}
        
    }
	
	@GetMapping(value = URIString.GET_AIRPORT_BYID)
	@Operation(summary = "GET AIRPORT BY ID")
    public AppResponse<AirportResponse> getAirportByID(@RequestParam("airportsAutoID") Long airportsAutoID) {
		AirportResponse airportResponse = new AirportResponse();
        try {
        	airportResponse = this.airportService.getAirportByID(airportsAutoID);
			return new AppResponse<>(true, "Airport load successfully!", airportResponse);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airport load successfully!", airportResponse);
		}
    }
	
	
}
