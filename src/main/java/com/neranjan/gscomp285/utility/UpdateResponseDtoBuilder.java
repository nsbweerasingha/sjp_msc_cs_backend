package com.neranjan.gscomp285.utility;

public interface UpdateResponseDtoBuilder <Entity, UpdateResponseDto> extends ResponseDtoBuilder {
	UpdateResponseDto buildUpdateResponseDto(Entity entity);
}
