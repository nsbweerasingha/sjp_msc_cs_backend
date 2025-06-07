package com.neranjan.gscomp285.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.AirplanesCategory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirplaneResponse {
	@JsonProperty("airplanesAutoID")
    private Long airplanesAutoID;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("model")
	private String model;
	
	@JsonProperty("airplanesCategoryAutoID")
    private Long airplanesCategoryAutoID;
	
	@JsonProperty("categoryName")
	private String categoryName;
	
//	@JsonProperty("airplanesCategoryAutoID")
//	private AirplanesCategory airplanesCategoryAutoID;
	
	
}
