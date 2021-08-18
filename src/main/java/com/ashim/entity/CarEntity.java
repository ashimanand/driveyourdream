package com.ashim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ashim.enums.CarStatus;
import com.ashim.enums.CarType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cars")
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class CarEntity {
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator="CUST_GEN")
	private Long id;
	private String manufacturer;
	private String registrationYear;
	private String model;
	private String fuleType;
	private String carPic;
	private int milage;
	private CarType carType;
	private String  carOwnerId;
	private String carNumber;
	private String carRegNum;
	private CarStatus status;
}
