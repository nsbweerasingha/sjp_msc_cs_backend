package com.neranjan.gscomp285.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirplaneCategoryResponse {
	
	@JsonProperty("airplanesCategoryAutoID")
	private Long airplanesCategoryAutoID;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("name")
	private String name;
}
