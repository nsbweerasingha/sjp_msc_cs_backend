package com.neranjan.gscomp285.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neranjan.gscomp285.entity.Airplanes;
import com.neranjan.gscomp285.entity.build.AirplaneBuilder;
import com.neranjan.gscomp285.repository.AirplaneRepository;
import com.neranjan.gscomp285.request.AirplaneRequest;
import com.neranjan.gscomp285.response.AirplaneResponse;
import com.neranjan.gscomp285.response.builder.AirplaneResponseBuilder;
import com.neranjan.gscomp285.response.list.AirplaneResponseList;
import com.neranjan.gscomp285.service.AirplaneService;

import jakarta.transaction.Transactional;

@Service
public class AirplaneServiceImpl implements AirplaneService{

	@Autowired
	private AirplaneRepository airplaneRepository;
	
	@Override
	@Transactional
	public AirplaneResponse saveAirplane(AirplaneRequest airplaneRequest) throws Exception {
		// TODO Auto-generated method stub
		AirplaneBuilder airplaneBuilder = new AirplaneBuilder();
		AirplaneResponseBuilder airplaneResponseBuilder = new AirplaneResponseBuilder();
		
		Airplanes airplanesEntity = new Airplanes();
		
		Airplanes airplane = this.airplaneRepository.save(airplaneBuilder.buildCreateEntity(airplaneRequest, airplanesEntity));
		
		return airplaneResponseBuilder.buildCreateResponseDto(airplane);
	}

	@Override
	public AirplaneResponse updateAirplane(AirplaneRequest airplaneRequest) throws Exception {
		// TODO Auto-generated method stub
		AirplaneBuilder airplaneBuilder = new AirplaneBuilder();
		AirplaneResponseBuilder airplaneResponseBuilder = new AirplaneResponseBuilder();
		
		Airplanes airplanesEntity = new Airplanes();
		
		Airplanes airplane = this.airplaneRepository.save(airplaneBuilder.buildCreateEntity(airplaneRequest, airplanesEntity));
		
		return airplaneResponseBuilder.buildCreateResponseDto(airplane);
	}

	@Override
	public void deleteAirplane(Long airplaneAutoID) throws Exception {
		// TODO Auto-generated method stub
		this.airplaneRepository.deleteById(airplaneAutoID);
	}

	@Override
	public AirplaneResponseList getAllAirplane() throws Exception {
		// TODO Auto-generated method stub	
		AirplaneResponseBuilder airplaneResponseBuilder = new AirplaneResponseBuilder();
		List<Airplanes> airplaneList = this.airplaneRepository.findAll();
		List<AirplaneResponse> responseList = new ArrayList<>();

		for (Airplanes airplane : airplaneList) {
			AirplaneResponse response = airplaneResponseBuilder.buildCreateResponseDto(airplane);
		    responseList.add(response);
		}

		return AirplaneResponseList.builder()
		        .airplaneResponseList(responseList)
		        .build();
	}

	@Override
	public AirplaneResponse getAirplaneByID(Long airplaneAutoID) throws Exception {
		// TODO Auto-generated method stub
		AirplaneResponseBuilder airplaneResponseBuilder = new AirplaneResponseBuilder();
		
		Optional<Airplanes> airplane = this.airplaneRepository.findById(airplaneAutoID);
		Airplanes response = airplane.orElse(null);

		return airplaneResponseBuilder.buildCreateResponseDto(response);
	}

}
