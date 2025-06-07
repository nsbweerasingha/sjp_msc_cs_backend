package com.neranjan.gscomp285.utility;

public interface CreateResponseDtoBuilder <Entity, CreateResponseDto> extends ResponseDtoBuilder{
	CreateResponseDto buildCreateResponseDto(Entity entity);
}
