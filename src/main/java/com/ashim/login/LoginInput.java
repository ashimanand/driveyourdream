package com.ashim.login;

import com.ashim.enums.UserRole;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginInput {
	
	@NotNull
	private String userName;

	@NonNull
	private String pwd;
	
	private UserRole role;
}
