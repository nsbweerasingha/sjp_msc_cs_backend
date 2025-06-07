package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Bookings;
import com.neranjan.gscomp285.request.BookingRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class BookingBuilder extends EntityBuilder<BookingRequest, Bookings>{

	@Override
	protected Bookings initUpdatedBy(Bookings entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Bookings initCreatedBy(Bookings entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Bookings initCreateEntity(BookingRequest request, Bookings entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Bookings();
		}

		if (request != null) {
			entity.setBookingAutoID(request.getBookingAutoID());
			entity.setBookingDate(request.getBookingDate());
			entity.setSeatClass(request.getSeatClass());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setSeatNumber(request.getSeatNumber());
			entity.setFlightsAutoID(request.getFlightsAutoID());
			entity.setPersonAutoID(request.getPersonAutoID());
		}
		return entity;
	}

	@Override
	protected Bookings initUpdateEntity(BookingRequest request, Bookings entity) {
		// TODO Auto-generated method stub
		entity = this.initCreateEntity(request,entity);
		return entity;
	}

}
