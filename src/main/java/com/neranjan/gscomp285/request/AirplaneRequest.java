package com.neranjan.gscomp285.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.AirplanesCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirplaneRequest {

	@JsonProperty("airplanesAutoID")
    private Long airplanesAutoID;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("model")
	private String model;
	
	@JsonProperty("airplanesCategoryAutoID")
	private AirplanesCategory airplanesCategoryAutoID;
}
