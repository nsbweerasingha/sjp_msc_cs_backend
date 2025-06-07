package com.neranjan.gscomp285.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neranjan.gscomp285.entity.Flights;
import com.neranjan.gscomp285.entity.build.FlightBuilder;
import com.neranjan.gscomp285.repository.FlightRepository;
import com.neranjan.gscomp285.request.FlightRequest;
import com.neranjan.gscomp285.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public Flights saveFlight(FlightRequest flightRequest) throws Exception {
		// TODO Auto-generated method stub
		FlightBuilder flightBuilder = new FlightBuilder();
		Flights flights = new Flights();
		flights = flightBuilder.buildCreateEntity(flightRequest, flights);
		Flights flight = this.flightRepository.save(flights);
		
		return flight;
	}

	@Override
	public Flights updateFlight(FlightRequest flightRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flights deleteFlight(FlightRequest flightRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flights> getAllFlight(FlightRequest flightRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flights getFlightByID(FlightRequest flightRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
