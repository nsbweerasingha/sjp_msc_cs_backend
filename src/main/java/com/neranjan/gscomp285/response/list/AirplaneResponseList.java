package com.neranjan.gscomp285.response.list;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.neranjan.gscomp285.entity.Airplanes;
import com.neranjan.gscomp285.response.AirplaneResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirplaneResponseList {
	private List<AirplaneResponse> airplaneResponseList;
}
