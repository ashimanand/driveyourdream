package com.ashim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_rental_plan")
@Getter @Setter @NoArgsConstructor 
public class CarRentalPlanEntity {
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator="CUST_GEN")
	private Long id;
	private String name;

}
