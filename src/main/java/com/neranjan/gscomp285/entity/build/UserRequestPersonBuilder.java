package com.neranjan.gscomp285.entity.build;

import java.util.Date;

import com.neranjan.gscomp285.entity.Person;
import com.neranjan.gscomp285.entity.User;
import com.neranjan.gscomp285.request.UserRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class UserRequestPersonBuilder extends EntityBuilder<UserRequest,Person>{

	@Override
	protected Person initUpdatedBy(Person entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Person initCreatedBy(Person entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected Person initCreateEntity(UserRequest request, Person entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new Person();
		}

		if (request != null) {
			entity.setFirstName(request.getFirstName());
			entity.setMiddleName(request.getMiddleName());
			entity.setLastName(request.getLastName());
			entity.setNic(request.getNic());
			entity.setPassport(request.getNic());
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setCompanyAutoID(request.getCompanyAutoID());
		}

		return entity;
	}

	@Override
	protected Person initUpdateEntity(UserRequest request, Person entity) {
		// TODO Auto-generated method stub
		entity = initCreateEntity(request,entity);
		return entity;
	}

}
