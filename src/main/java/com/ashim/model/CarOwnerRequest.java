package com.ashim.model;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class CarOwnerRequest {
	private Long id;
	private String userId;
	private String pwd;
	private String name;
	private String address;
	private String phone;
	private String pancard;
	private String adharCard;

}
