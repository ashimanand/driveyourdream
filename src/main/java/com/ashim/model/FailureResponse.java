package com.ashim.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Builder @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class FailureResponse {
	private String status;
	private String failureResion;

}
