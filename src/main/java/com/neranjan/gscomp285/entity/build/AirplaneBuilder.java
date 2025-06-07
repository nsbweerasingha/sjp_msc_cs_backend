package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Airplanes;
import com.neranjan.gscomp285.request.AirplaneRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class AirplaneBuilder extends EntityBuilder<AirplaneRequest, Airplanes>{
	
	@Override
	protected Airplanes initUpdatedBy(Airplanes entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Airplanes initCreatedBy(Airplanes entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Airplanes initCreateEntity(AirplaneRequest request, Airplanes entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Airplanes();
		}

		if (request != null) {
			entity.setAirplanesAutoID(request.getAirplanesAutoID());
			entity.setCode(request.getCode());
			entity.setModel(request.getModel());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setAirplanesCategoryAutoID(request.getAirplanesCategoryAutoID());
		}
		System.out.println("entity : " + entity);
		return entity;
	}

	@Override
	protected Airplanes initUpdateEntity(AirplaneRequest request, Airplanes entity) {
		// TODO Auto-generated method stub
		entity = buildUpdateEntity(request, entity);
		return entity;
	}

}
