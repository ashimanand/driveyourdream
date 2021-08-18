package com.ashim.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ashim.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="session")
@NoArgsConstructor
@Builder
@Setter
@Getter
@AllArgsConstructor
public class SessionEntity {
	@Id @GeneratedValue
	private UUID id;
	private String userId;
	private Long loginTime;
	private Long loginExpiry;
	private UserRole role;

}
