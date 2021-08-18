package com.ashim.contorller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashim.entity.CarOwnerEntity;
import com.ashim.entity.UserBaseEntity;
import com.ashim.enums.UserRole;
import com.ashim.model.CarOwnerRequest;
import com.ashim.repo.CarOwnerRepository;
import com.ashim.repo.UserBaseRepository;


@RestController
@RequestMapping(path="owner")
public class CarOwnerController {

	@Autowired
	CarOwnerRepository ownerRepo;
	
	@Autowired
	UserBaseRepository userRepo;

	@PostMapping
	public ResponseEntity<Object> registorCarOwner(@RequestBody CarOwnerRequest owner){

		CarOwnerEntity coe = 	CarOwnerEntity.builder()
				.userId(owner.getUserId())
				.address(owner.getAddress())
				.adharCard(owner.getAdharCard())
				.name(owner.getName())
				.pancard(owner.getPancard())
				.phone(owner.getPhone())
				.onboardingDateTime(System.currentTimeMillis())
				.build();

		CarOwnerEntity regiOwner =  ownerRepo.save(coe);
		userRepo.save(UserBaseEntity.builder().pwd(owner.getPwd()).userId(owner.getUserId()).role(UserRole.CAROWNER).build());
		
		
		return new ResponseEntity<Object>(regiOwner, HttpStatus.OK);
	}

}
