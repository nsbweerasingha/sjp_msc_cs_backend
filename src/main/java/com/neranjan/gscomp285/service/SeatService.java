package com.neranjan.gscomp285.service;

import java.util.List;

import com.neranjan.gscomp285.entity.Seats;
import com.neranjan.gscomp285.request.SeatRequest;

public interface SeatService {

	public Seats saveSeats(SeatRequest seatRequest) throws Exception;

	public Seats updateSeats(SeatRequest seatRequest) throws Exception;

	public Seats deleteSeats(SeatRequest seatRequest) throws Exception;

	public List<Seats> getAllSeats(SeatRequest seatRequest) throws Exception;

	public Seats getSeatsByID(SeatRequest seats) throws Exception;

}
