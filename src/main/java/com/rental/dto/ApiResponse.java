package com.rental.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ApiResponse {
	private String message;
	private String status;
}
