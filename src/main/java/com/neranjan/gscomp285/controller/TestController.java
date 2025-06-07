package com.neranjan.gscomp285.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.uri.URIString;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.TEST)
public class TestController {
	@GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }
    @GetMapping("/user")
    public String userAccess() {
        return "User Content.";
    }
}
