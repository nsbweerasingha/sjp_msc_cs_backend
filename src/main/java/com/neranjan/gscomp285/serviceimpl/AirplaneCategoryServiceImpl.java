package com.neranjan.gscomp285.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neranjan.gscomp285.entity.AirplanesCategory;
import com.neranjan.gscomp285.repository.AirplaneCategoryRepository;
import com.neranjan.gscomp285.response.AirplaneCategoryResponse;
import com.neranjan.gscomp285.response.builder.AirplaneCategoryResponseBuilder;
import com.neranjan.gscomp285.response.list.AirplaneCategoryResponseList;
import com.neranjan.gscomp285.service.AirplaneCategoryService;

@Service
public class AirplaneCategoryServiceImpl implements AirplaneCategoryService{

	@Autowired
	AirplaneCategoryRepository airplaneCategoryRepository;
	
	@Override
	public AirplaneCategoryResponseList getAllAirplaneCategory() throws Exception {
		// TODO Auto-generated method stub
		AirplaneCategoryResponseBuilder airplaneCategoryResponseBuilder = new AirplaneCategoryResponseBuilder();
		List<AirplanesCategory> airplanesCategoryList = this.airplaneCategoryRepository.findAll();
		List<AirplaneCategoryResponse> responseList = new ArrayList<>();

		for (AirplanesCategory airplanesCategory : airplanesCategoryList) {
			AirplaneCategoryResponse response = airplaneCategoryResponseBuilder.buildCreateResponseDto(airplanesCategory);
		    responseList.add(response);
		}

		return AirplaneCategoryResponseList.builder()
		        .airplaneCategoryResponseList(responseList)
		        .build();
	}

	@Override
	public AirplaneCategoryResponse getAirplaneCategoryByID(Long airplanesCategoryAutoID) {
		// TODO Auto-generated method stub
		return null;
	}

}
