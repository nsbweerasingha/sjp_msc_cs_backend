package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Flights;
import com.neranjan.gscomp285.entity.Seats;
import com.neranjan.gscomp285.request.SeatRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class SeatBuilder extends EntityBuilder<SeatRequest, Seats>{@Override
	protected Seats initUpdatedBy(Seats entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Seats initCreatedBy(Seats entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Seats initCreateEntity(SeatRequest request, Seats entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Seats();
		}

		if (request != null) {
			entity.setSeatAutoID(request.getSeatAutoID());
			entity.setSeatClass(request.getSeatClass());
			entity.setSeatNumber(request.getSeatNumber());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setStatus(request.getStatus());
			entity.setFlightsAutoID(request.getFlightsAutoID());
		}
		return entity;
	}

	@Override
	protected Seats initUpdateEntity(SeatRequest request, Seats entity) {
		// TODO Auto-generated method stub
		entity = this.initCreateEntity(request,entity);
		return entity;
	}

}
