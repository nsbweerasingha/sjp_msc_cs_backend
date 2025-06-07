package com.neranjan.gscomp285.request;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.Airplanes;
import com.neranjan.gscomp285.entity.Airports;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightRequest {
	
	@JsonProperty("flightsAutoID")
	private Long flightsAutoID;
	
	@JsonProperty("airplanesAutoID")
	private Airplanes airplanesAutoID;
	
	@JsonProperty("origin")
	private Airports origin;
	
	@JsonProperty("destination")
	private Airports destination;
	
	@JsonProperty("departureTime")
	private Date departureTime;
	
	@JsonProperty("arrivalTime")
	private Date arrivalTime;
	
	@JsonProperty("price")
	private BigDecimal price;
	
	@JsonProperty("flights_date")
	private Date flightsDate;
}
