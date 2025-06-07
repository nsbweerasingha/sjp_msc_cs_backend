package com.neranjan.gscomp285.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neranjan.gscomp285.entity.Airports;
import com.neranjan.gscomp285.entity.build.AirportBuilder;
import com.neranjan.gscomp285.repository.AirportRepository;
import com.neranjan.gscomp285.request.AirportRequest;
import com.neranjan.gscomp285.response.AirportResponse;
import com.neranjan.gscomp285.response.builder.AirportResponseBuilder;
import com.neranjan.gscomp285.response.list.AirportResponseList;
import com.neranjan.gscomp285.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{
	
	@Autowired
	AirportRepository airportRepository;

	@Override
	public AirportResponse saveAirport(AirportRequest airportRequest) throws Exception {
		// TODO Auto-generated method stub
		
		AirportBuilder airportBuilder = new AirportBuilder();
		Airports airportsEntity = new Airports();
		AirportResponseBuilder airportResponseBuilder = new AirportResponseBuilder();
		
		
		Airports airports = airportBuilder.buildCreateEntity(airportRequest, airportsEntity);
		
		Airports airport = this.airportRepository.save(airports);
		
		return airportResponseBuilder.buildCreateResponseDto(airport);
	}

	@Override
	public AirportResponse updateAirport(AirportRequest airportRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAirport(Long airportsAutoID) throws Exception {
		// TODO Auto-generated method stub
		this.airportRepository.deleteById(airportsAutoID);
	}

	@Override
	public AirportResponseList getAllAirport() throws Exception {
		// TODO Auto-generated method stub
		AirportResponseBuilder airportResponseBuilder = new AirportResponseBuilder();
		
		List<Airports> airportList = this.airportRepository.findAll();
		List<AirportResponse> responseList = new ArrayList<>();

		for (Airports airport : airportList) {
			AirportResponse response = airportResponseBuilder.buildCreateResponseDto(airport);
		    responseList.add(response);
		}

		return AirportResponseList.builder()
		        .airportResponse(responseList)
		        .build();
	}

	@Override
	public AirportResponse getAirportByID(Long airportsAutoID) throws Exception {
		// TODO Auto-generated method stub
		AirportResponseBuilder airportResponseBuilder = new AirportResponseBuilder();
		
		Optional<Airports> airport = this.airportRepository.findById(airportsAutoID);
		
		Airports response = airport.orElse(null);
		
		return airportResponseBuilder.buildCreateResponseDto(response);
	}

	

}
