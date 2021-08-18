package com.ashim.model;

import com.ashim.enums.CarStatus;
import com.ashim.enums.CarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class AddCarRequest extends BaseRequest {
	
	private String manufacturer;
	private String registrationYear;
	private String model;
	private String fuleType;
	private String carPic;
	private int milage;
	private CarType carType;
	private Long  carOwnerId;
	private String carNumber;
	private String carRegNum;

}
