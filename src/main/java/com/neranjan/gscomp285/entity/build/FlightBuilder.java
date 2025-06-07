package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Flights;
import com.neranjan.gscomp285.request.FlightRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class FlightBuilder extends EntityBuilder<FlightRequest, Flights>{
	
	@Override
	protected Flights initUpdatedBy(Flights entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Flights initCreatedBy(Flights entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Flights initCreateEntity(FlightRequest request, Flights entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Flights();
		}

		if (request != null) {
			entity.setFlightsAutoID(request.getFlightsAutoID());
			entity.setArrivalTime(request.getArrivalTime());
			entity.setDepartureTime(request.getDepartureTime());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setAirplanesAutoID(request.getAirplanesAutoID());
			entity.setDestination(request.getDestination());
			entity.setOrigin(request.getOrigin());
			entity.setPrice(request.getPrice());
			entity.setFlightsDate(request.getFlightsDate());
		}
		return entity;
	}

	@Override
	protected Flights initUpdateEntity(FlightRequest request, Flights entity) {
		// TODO Auto-generated method stub
		entity = buildUpdateEntity(request, entity);
		return entity;
	}

}
