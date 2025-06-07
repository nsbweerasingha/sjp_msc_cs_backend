package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Airports;
import com.neranjan.gscomp285.request.AirportRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class AirportBuilder extends EntityBuilder<AirportRequest,Airports>{
	
	@Override
	protected Airports initUpdatedBy(Airports entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Airports initCreatedBy(Airports entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Airports initCreateEntity(AirportRequest request, Airports entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Airports();
		}

		if (request != null) {
			entity.setAirportsAutoID(request.getAirportsAutoID());
			entity.setCity(request.getCity());
			entity.setCode(request.getCode());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setName(request.getName());
			entity.setCountryAutoID(request.getCountryAutoID());
		}
		return entity;
	}

	@Override
	protected Airports initUpdateEntity(AirportRequest request, Airports entity) {
		// TODO Auto-generated method stub
		entity = buildUpdateEntity(request, entity);
		return entity;
	}

}
