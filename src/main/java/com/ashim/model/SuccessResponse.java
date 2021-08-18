package com.ashim.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter @Setter @NoArgsConstructor @ToString
public class SuccessResponse {
	private String message;

}
