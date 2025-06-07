package com.neranjan.gscomp285.service;

import com.neranjan.gscomp285.request.AirportRequest;
import com.neranjan.gscomp285.response.AirportResponse;
import com.neranjan.gscomp285.response.list.AirportResponseList;

public interface AirportService {

	public AirportResponse saveAirport(AirportRequest airportRequest) throws Exception;

	public AirportResponse updateAirport(AirportRequest airportRequest) throws Exception;

	public void deleteAirport(Long airportsAutoID) throws Exception;

	public AirportResponseList getAllAirport() throws Exception;

	public AirportResponse getAirportByID(Long airportsAutoID) throws Exception;

}
