package com.neranjan.gscomp285.entity.build;


import java.util.Date;

import com.neranjan.gscomp285.entity.PersonContact;
import com.neranjan.gscomp285.request.UserRequest;
import com.neranjan.gscomp285.utility.EntityBuilder;

import lombok.Data;

@Data
public class PersonContactBuilder extends EntityBuilder<UserRequest,PersonContact>{
	
	@Override
	protected PersonContact initUpdatedBy(PersonContact entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected PersonContact initCreatedBy(PersonContact entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	protected PersonContact initCreateEntity(UserRequest request, PersonContact entity) {
		// TODO Auto-generated method stub
		if (entity == null) {
			entity = new PersonContact();
		}

		if (request != null) {
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			entity.setCompanyAutoID(request.getCompanyAutoID());
		}
		return entity;
	}

	@Override
	protected PersonContact initUpdateEntity(UserRequest request, PersonContact entity) {
		// TODO Auto-generated method stub
		entity = buildUpdateEntity(request, entity);
		return entity;
	}

}
