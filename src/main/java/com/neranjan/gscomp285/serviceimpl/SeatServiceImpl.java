package com.neranjan.gscomp285.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neranjan.gscomp285.entity.Seats;
import com.neranjan.gscomp285.entity.build.SeatBuilder;
import com.neranjan.gscomp285.repository.SeatRepository;
import com.neranjan.gscomp285.request.SeatRequest;
import com.neranjan.gscomp285.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService{

	@Autowired
	SeatRepository seatRepository;
	
	@Override
	public Seats saveSeats(SeatRequest seatRequest) throws Exception {
		// TODO Auto-generated method stub
		SeatBuilder seatBuilder = new SeatBuilder();
		Seats seats = new Seats();
		seats = seatBuilder.buildCreateEntity(seatRequest, seats);
		Seats seatResponse = this.seatRepository.save(seats);
		
		return seatResponse;
	}

	@Override
	public Seats updateSeats(SeatRequest seatRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seats deleteSeats(SeatRequest seatRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seats> getAllSeats(SeatRequest seatRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seats getSeatsByID(SeatRequest seats) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
