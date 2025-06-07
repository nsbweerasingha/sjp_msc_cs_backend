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
import com.neranjan.gscomp285.request.AirplaneRequest;
import com.neranjan.gscomp285.response.AirplaneResponse;
import com.neranjan.gscomp285.response.list.AirplaneResponseList;
import com.neranjan.gscomp285.service.AirplaneService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.AIRPLANE)
public class AirplaneController {
	@Autowired
	AirplaneService airplaneService;
	
	@PostMapping(value = URIString.SAVE_AIRPLANE)
	@Operation(summary = "SAVE AIRPLANE")
    public AppResponse<String> saveAirplane(@RequestBody AirplaneRequest airplaneRequest) {
        
        try {
			this.airplaneService.saveAirplane(airplaneRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "Airplane save successfully!", "");
    }
	
	@PutMapping(value = URIString.UPDATE_AIRPLANE)
	@Operation(summary = "UPDATE AIRPLANE")
    public AppResponse<String> updateAirplane(@RequestBody AirplaneRequest airplaneRequest) {
        
        try {
			this.airplaneService.updateAirplane(airplaneRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return new AppResponse<>(true, "Airplane update successfully!", "");
    }
	
	@DeleteMapping(value = URIString.DELETE_AIRPLANE)
	@Operation(summary = "DELETE AIRPLANE")
    public AppResponse<String> deleteAirplane(@RequestParam("airplaneAutoID") Long airplaneAutoID) {
        
        try {
			this.airplaneService.deleteAirplane(airplaneAutoID);
			return new AppResponse<>(true, "Airplane delete successfully!", null);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airplane delete unsuccessfully!", null);
		}
        
    }
	
	@GetMapping(value = URIString.GET_ALL_AIRPLANE)
	@Operation(summary = "GET ALL AIRPLANE")
    public AppResponse<AirplaneResponseList> getAllAirplane() {
		AirplaneResponseList airplaneList = new AirplaneResponseList();
        try {
        	airplaneList = this.airplaneService.getAllAirplane();
        	return new AppResponse<>(true, "Airplane Load successfully!", airplaneList);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(false, "Airplane Load unsuccessfully!", airplaneList);
		}
        
    }
	
	@GetMapping(value = URIString.GET_AIRPLANE_BYID)
	@Operation(summary = "GET AIRPLANE BY ID")
    public AppResponse<AirplaneResponse> getAirplaneByID(@RequestParam("airplaneAutoID") Long airplaneAutoID) {
		AirplaneResponse respone = new AirplaneResponse();
        try {
        	respone = this.airplaneService.getAirplaneByID(airplaneAutoID);
			return new AppResponse<>(true, "Airplane Load successfully!", respone);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(true, "Airplane Load unsuccessfully!", respone);
		}
    }
}
