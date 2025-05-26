package com.neranjan.gscomp285.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.config.AppResponse;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.AUTH)
public class AuthController {
	@PostMapping(value = URIString.LOGIN)
	@Operation(summary = "User Loging")
	public AppResponse<Void>  login(){
			return new AppResponse<>(true, "User deleted successfully", null);
	}
}
