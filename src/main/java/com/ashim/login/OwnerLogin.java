package com.ashim.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashim.entity.SessionEntity;
import com.ashim.entity.UserBaseEntity;
import com.ashim.enums.UserRole;
import com.ashim.model.FailureResponse;
import com.ashim.repo.SessionRepository;
import com.ashim.repo.UserBaseRepository;

@RestController
@RequestMapping(path = "loginowner")
public class OwnerLogin {
	
	@Autowired
	UserBaseRepository repo;
	
	@Autowired
	SessionRepository sessionrepo;
	
	@PostMapping
	public ResponseEntity<Object> doLogin(@RequestBody LoginInput requst){
		
		System.out.println("requst:"+requst);
		List<UserBaseEntity> users = repo.getByUserId(requst.getUserName());
		if(users == null || users.size() == 0) {
			
			return new ResponseEntity<Object>(FailureResponse.builder().status("400").failureResion("User not registered."), HttpStatus.BAD_REQUEST);
		}else if (users.size() > 1) {
			return new ResponseEntity<Object>(FailureResponse.builder().status("400").failureResion("Administration problem. Please reach out to customer case"), HttpStatus.BAD_REQUEST);
		} 
		if(users.get(0).getPwd().equals(requst.getPwd())){
		
			SessionEntity session = sessionrepo.save(SessionEntity.builder().userId(requst.getUserName())
					.role(UserRole.CAROWNER)
					.loginTime(System.currentTimeMillis())
					.loginExpiry(System.currentTimeMillis()+ 3600000).build());
				
				LoginResponse response =  LoginResponse.builder().sessionKey(session.getId().toString())
										.sessionExpiry(session.getLoginExpiry().toString())
										.userId(session.getUserId())
										.nextUri("ohome.html").build();
				return new ResponseEntity<Object>(response, HttpStatus.OK);
				
		}else {
			return new ResponseEntity<Object>(FailureResponse.builder().status("400").failureResion("User Id password does not match."), HttpStatus.BAD_REQUEST);
		}
		
	}

}
