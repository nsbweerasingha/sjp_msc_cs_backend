package com.neranjan.gscomp285.entity.build;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.neranjan.gscomp285.entity.User;
import com.neranjan.gscomp285.request.UserRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class UserRequestBuilder extends EntityBuilder<UserRequest,User>{
	
	@Override
	protected User initCreateEntity(UserRequest request, User entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new User();
		}

		if (request != null) {
			entity.setUsername(request.getUsername());
//			entity.setPassword(encoder.encode(request.getPassword()));
			entity.setStatus(1);
			entity.setCompanyAutoID(request.getCompanyAutoID());
			entity.setUserRoleAutoID(request.getUserRoleAutoID());
		}
		return entity;
	}

	@Override
	protected User initUpdatedBy(User entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected User initCreatedBy(User entity) {
		// TODO Auto-generated method stub
		return entity;
	}
	
	@Override
	public User initUpdateEntity(UserRequest request, User entity) {
		entity = buildUpdateEntity(request, entity);
		return entity;
	}
	

}
