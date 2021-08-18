package com.ashim.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

	private String sessionKey;
	private String userId;
	private String sessionExpiry;
	private String nextUri;
}
