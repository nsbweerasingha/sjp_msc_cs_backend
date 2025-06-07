package com.neranjan.gscomp285.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.neranjan.gscomp285.entity.Company;
import com.neranjan.gscomp285.entity.PersonContact;
import com.neranjan.gscomp285.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {
	
	@JsonProperty("username")
    private String username;
	
	@JsonProperty("password")
    private String password;
	
	@JsonProperty("first_name")
    private String firstName;
	
	@JsonProperty("middleName")
	private String middleName;
	
	@JsonProperty("lastName")
    private String lastName;
	
	@JsonProperty("passport")
    private String passport;
	
	@JsonProperty("nic")
	private String nic;
	
	@JsonProperty("contactDetails")
	private List<PersonContactRequest> contactDetails;
	
	@JsonProperty("userRoleAutoID")
	private UserRole userRoleAutoID;
	
	@JsonProperty("companyAutoID")
	private Company companyAutoID;
}
