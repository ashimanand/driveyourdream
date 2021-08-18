package com.ashim.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter 
public class BaseRequest {
	private String userId;
	private String sessionKey;
	
}
