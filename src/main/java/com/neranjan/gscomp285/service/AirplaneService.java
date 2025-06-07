package com.neranjan.gscomp285.service;

import com.neranjan.gscomp285.request.AirplaneRequest;
import com.neranjan.gscomp285.response.AirplaneResponse;
import com.neranjan.gscomp285.response.list.AirplaneResponseList;

public interface AirplaneService {

	public AirplaneResponse saveAirplane(AirplaneRequest airplaneRequest) throws Exception;

	public AirplaneResponse updateAirplane(AirplaneRequest airplaneRequest) throws Exception;

	public void deleteAirplane(Long airplaneAutoID) throws Exception;

	public AirplaneResponseList getAllAirplane() throws Exception;

	public AirplaneResponse getAirplaneByID(Long airplaneAutoID) throws Exception;

}
