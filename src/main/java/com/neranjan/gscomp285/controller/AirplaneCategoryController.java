package com.neranjan.gscomp285.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.config.AppResponse;
import com.neranjan.gscomp285.response.AirplaneCategoryResponse;
import com.neranjan.gscomp285.response.list.AirplaneCategoryResponseList;
import com.neranjan.gscomp285.service.AirplaneCategoryService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.AIRPLANE_CATEGORY)
public class AirplaneCategoryController {
	@Autowired
	AirplaneCategoryService airplaneCategoryService;
	
	@GetMapping(value = URIString.GET_ALL_AIRPLANECATEGORY)
	@Operation(summary = "GET ALL AIRPLANE CATEGORY")
    public AppResponse<AirplaneCategoryResponseList> getAllAirplane() {
		AirplaneCategoryResponseList airplaneCategoryResponseList = new AirplaneCategoryResponseList();
        try {
        	airplaneCategoryResponseList = this.airplaneCategoryService.getAllAirplaneCategory();
        	return new AppResponse<>(true, "Airplane Category Load successfully!", airplaneCategoryResponseList);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(false, "Airplane Category Load unsuccessfully!", airplaneCategoryResponseList);
		}
        
    }
	
	@GetMapping(value = URIString.GET_AIRPLANECATEGORY_BYID)
	@Operation(summary = "GET AIRPLANE CATEGORY BY ID")
    public AppResponse<AirplaneCategoryResponse> getAirplaneByID(@RequestBody Long airplanesCategoryAutoID) {
		AirplaneCategoryResponse airplaneCategoryResponse = new AirplaneCategoryResponse();
        try {
        	airplaneCategoryResponse = this.airplaneCategoryService.getAirplaneCategoryByID(airplanesCategoryAutoID);
        	return new AppResponse<>(true, "Airplane Category Load successfully!", airplaneCategoryResponse);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<>(false, "Airplane Category Load unsuccessfully!", airplaneCategoryResponse);
		}
        
    }
}
