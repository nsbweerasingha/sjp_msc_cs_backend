package com.neranjan.gscomp285.service;

import java.util.List;

import com.neranjan.gscomp285.entity.Flights;
import com.neranjan.gscomp285.request.FlightRequest;

public interface FlightService {

	public Flights saveFlight(FlightRequest flightRequest) throws Exception;

	public Flights updateFlight(FlightRequest flightRequest) throws Exception;

	public Flights deleteFlight(FlightRequest flightRequest) throws Exception;

	public List<Flights> getAllFlight(FlightRequest flightRequest) throws Exception;

	public Flights getFlightByID(FlightRequest flightRequest) throws Exception;

}
