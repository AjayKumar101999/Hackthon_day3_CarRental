package com.rental.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

	@NotBlank(message = "Please provide the username" )
	@Size(min = 5, max = 25, message = "username size should be in range from 5 - 25")
	private String carName;

	@Min(1)
	@Max(10)
	private Integer quantity;
	
	@NotBlank(message = "Please provide the carType" )
	private String carType;
	
	@Min(400000)
	@Max(1500000)
	private Double carPrice;
	
}
