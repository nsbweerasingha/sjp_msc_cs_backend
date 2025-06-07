package com.neranjan.gscomp285.response.builder;


import org.springframework.stereotype.Component;

import com.neranjan.gscomp285.entity.Airplanes;
import com.neranjan.gscomp285.response.AirplaneResponse;
import com.neranjan.gscomp285.utility.CreateResponseDtoBuilder;
import com.neranjan.gscomp285.utility.UpdateResponseDtoBuilder;

@Component
public class AirplaneResponseBuilder implements 
CreateResponseDtoBuilder<Airplanes,AirplaneResponse>,
UpdateResponseDtoBuilder<Airplanes,AirplaneResponse>{

	@Override
	public AirplaneResponse buildUpdateResponseDto(Airplanes entity) {
		// TODO Auto-generated method stub
		return buildCreateResponseDto(entity);
	}

	@Override
	public AirplaneResponse buildCreateResponseDto(Airplanes entity) {
		// TODO Auto-generated method stub
		return AirplaneResponse.builder()
				.airplanesAutoID(entity.getAirplanesAutoID())
				.code(entity.getCode())
				.model(entity.getModel())
				.categoryName(entity.getAirplanesCategoryAutoID().getName())
				.airplanesCategoryAutoID(entity.getAirplanesCategoryAutoID().getAirplanesCategoryAutoID())
//				.airplanesCategoryAutoID(entity.getAirplanesCategoryAutoID())
				.build();
	}

}
