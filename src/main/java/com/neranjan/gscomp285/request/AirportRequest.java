package com.neranjan.gscomp285.request;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.MstCountry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirportRequest {
	@JsonProperty("airportsAutoID")
    private Long airportsAutoID;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("countryAutoID")
	private MstCountry countryAutoID;
	
	
	
}
