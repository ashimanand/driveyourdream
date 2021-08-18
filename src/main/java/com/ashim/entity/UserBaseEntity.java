package com.ashim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ashim.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Getter @Setter
@AllArgsConstructor
@Builder
@Table(name="user_base")
public class UserBaseEntity {
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator="CUST_GEN")
	private Long id;
	private String userId;
	private String pwd;
	private UserRole role;

}
