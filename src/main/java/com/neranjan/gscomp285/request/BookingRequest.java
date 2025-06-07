package com.neranjan.gscomp285.request;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.Flights;
import com.neranjan.gscomp285.entity.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingRequest {
	@JsonProperty("bookingAutoID")
	private Long bookingAutoID;
	
	@JsonProperty("flightsAutoID")
	private Flights flightsAutoID;
	
	@JsonProperty("personAutoID")
	private Person personAutoID;
	
	@JsonProperty("seatClass")
	private String seatClass;
	
	@JsonProperty("seatNumber")
	private int seatNumber;
	
	@JsonProperty("bookingDate")
	private Date bookingDate;
	
	@JsonProperty("paidAmount")
	private BigDecimal paidAmount;
}
