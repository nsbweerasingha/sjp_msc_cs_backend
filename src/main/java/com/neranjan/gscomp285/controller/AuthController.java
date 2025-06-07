package com.neranjan.gscomp285.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neranjan.gscomp285.config.AppResponse;
import com.neranjan.gscomp285.config.JwtUtil;
import com.neranjan.gscomp285.entity.User;
import com.neranjan.gscomp285.repository.UserRepository;
import com.neranjan.gscomp285.request.UserRequest;
import com.neranjan.gscomp285.service.UserService;
import com.neranjan.gscomp285.uri.URIString;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(URIString.V1 + URIString.AUTH)
public class AuthController {
	@Autowired
    AuthenticationManager authenticationManager;
	
    @Autowired
    UserRepository userRepository;
    
    @Autowired
    PasswordEncoder encoder;
    
    @Autowired
    JwtUtil jwtUtils;
    
    @Autowired
    private UserService userService;
    
    @PostMapping(value = URIString.SIGN_IN)
	@Operation(summary = "User Loging")
    public AppResponse<String> authenticateUser(@RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return new AppResponse<>(true, "User authenticate successfully!", jwtUtils.generateToken(userDetails.getUsername()));
    }
	
	@PostMapping(value = URIString.SIGN_UP)
	@Operation(summary = "User Register")
    public AppResponse<String> registerUser(@RequestBody UserRequest UserRequest) {
        if (userRepository.existsByUsername(UserRequest.getUsername())) {
            return new AppResponse<>(false,"Error: Username is already taken!", null);
        }
        
        try {
        	this.userService.registerUser(UserRequest);
		} catch (Exception e) {
			// TODO: handle exception
			return new AppResponse<String>(false, "Error 3 Invalid Request", e.getMessage());
		}
        
        // Create new user's account
//        User newUser = new User(
//                null,
//                user.getUsername(),
//                encoder.encode(user.getPassword()),
//                1
//        );
//        userRepository.save(newUser);
        
        return new AppResponse<>(true,"User registered successfully!", null);
    }
}
