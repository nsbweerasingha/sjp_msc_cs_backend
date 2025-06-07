package com.neranjan.gscomp285.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.neranjan.gscomp285.entity.MstContactType;
import com.neranjan.gscomp285.entity.Person;
import com.neranjan.gscomp285.entity.PersonContact;
import com.neranjan.gscomp285.entity.User;
import com.neranjan.gscomp285.entity.build.PersonContactBuilder;
import com.neranjan.gscomp285.entity.build.UserRequestBuilder;
import com.neranjan.gscomp285.entity.build.UserRequestPersonBuilder;
import com.neranjan.gscomp285.repository.MstContactTypeRepository;
import com.neranjan.gscomp285.repository.PersonContactRepository;
import com.neranjan.gscomp285.repository.PersonRepository;
import com.neranjan.gscomp285.repository.UserRepository;
import com.neranjan.gscomp285.request.PersonContactRequest;
import com.neranjan.gscomp285.request.UserRequest;
import com.neranjan.gscomp285.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private PersonContactRepository personContactRepository;
	
	@Autowired
	private MstContactTypeRepository mstContactTypeRepository;
	
	@Autowired
    PasswordEncoder encoder;
	
	@Override
	public String registerUser(UserRequest userRequest) throws Exception {
		// TODO Auto-generated method stub

		UserRequestBuilder userRequestBuilder = new UserRequestBuilder();
		UserRequestPersonBuilder userRequestPersonBuilder = new UserRequestPersonBuilder();
		PersonContactBuilder personContactBuilder = new PersonContactBuilder();
		
		User usersEntity = new User();
		Person personEntity = new Person();
		PersonContact personContactEntity = new PersonContact();
		
		Person person = this.personRepository.save(userRequestPersonBuilder.buildCreateEntity(userRequest, personEntity));
		
		List<PersonContactRequest> personContactRequest = userRequest.getContactDetails();
		for(PersonContactRequest contact : personContactRequest) {
			MstContactType mstContactType = this.mstContactTypeRepository.findbycode(contact.getType());
		    System.out.println(mstContactType);
		    personContactEntity = personContactBuilder.buildCreateEntity(userRequest, personContactEntity);
			personContactEntity.setContactTypeAutoID(mstContactType);
			personContactEntity.setValue(contact.getValue());
			personContactEntity.setPersonAutoID(person);
			PersonContact personContact = this.personContactRepository.save(personContactEntity);
		}		
		
		usersEntity = userRequestBuilder.buildCreateEntity(userRequest, usersEntity);
		usersEntity.setPersonAutoID(person);
		usersEntity.setPassword(encoder.encode(userRequest.getPassword()));
		User users = this.userRepository.save(usersEntity);
		
		if(users != null && person != null) {
			
		}
		return null;
		
		
	}

}
