package com.rental.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ValidationErrorResponse {
	
	private String statusCode;
	private Map<String, String> errors = new HashMap<>();

}
