package com.neranjan.gscomp285.response.builder;

import com.neranjan.gscomp285.entity.Airports;
import com.neranjan.gscomp285.response.AirportResponse;
import com.neranjan.gscomp285.utility.CreateResponseDtoBuilder;
import com.neranjan.gscomp285.utility.UpdateResponseDtoBuilder;

public class AirportResponseBuilder implements 
CreateResponseDtoBuilder<Airports, AirportResponse>,
UpdateResponseDtoBuilder<Airports, AirportResponse> {

	@Override
	public AirportResponse buildUpdateResponseDto(Airports entity) {
		// TODO Auto-generated method stub
		return buildCreateResponseDto(entity);
	}

	@Override
	public AirportResponse buildCreateResponseDto(Airports entity) {
		// TODO Auto-generated method stub
		return AirportResponse.builder()
				.airportsAutoID(entity.getAirportsAutoID())
				.code(entity.getCode())
				.name(entity.getName())
				.city(entity.getCity())
				.countryAutoID(entity.getCountryAutoID().getCountryAutoID())
				.countryName(entity.getCountryAutoID().getCountryDes())
				.build();
	}
	
}
