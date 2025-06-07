package com.neranjan.gscomp285.service;

import com.neranjan.gscomp285.response.AirplaneCategoryResponse;
import com.neranjan.gscomp285.response.list.AirplaneCategoryResponseList;


public interface AirplaneCategoryService {

	public AirplaneCategoryResponseList getAllAirplaneCategory() throws Exception;

	public AirplaneCategoryResponse getAirplaneCategoryByID(Long airplanesCategoryAutoID);

}
