package com.neranjan.gscomp285.response.builder;

import com.neranjan.gscomp285.entity.AirplanesCategory;
import com.neranjan.gscomp285.response.AirplaneCategoryResponse;
import com.neranjan.gscomp285.utility.CreateResponseDtoBuilder;
import com.neranjan.gscomp285.utility.UpdateResponseDtoBuilder;

public class AirplaneCategoryResponseBuilder implements 
CreateResponseDtoBuilder<AirplanesCategory, AirplaneCategoryResponse>,
UpdateResponseDtoBuilder<AirplanesCategory, AirplaneCategoryResponse>{

	@Override
	public AirplaneCategoryResponse buildUpdateResponseDto(AirplanesCategory entity) {
		// TODO Auto-generated method stub
		return buildCreateResponseDto(entity);
	}

	@Override
	public AirplaneCategoryResponse buildCreateResponseDto(AirplanesCategory entity) {
		// TODO Auto-generated method stub
		return AirplaneCategoryResponse.builder()
				.airplanesCategoryAutoID(entity.getAirplanesCategoryAutoID())
				.code(entity.getCode())
				.name(entity.getName())
				.build();
	}

}
