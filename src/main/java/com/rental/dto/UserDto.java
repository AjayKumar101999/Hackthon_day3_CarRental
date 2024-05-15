package com.rental.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

	@NotBlank(message = "Please provide the username" )
	@Size(min = 5, max = 25, message = "username size should be in range from 5 - 25")
	private String userName;
	
	@Email(message = "Invalid email! please provide the currect email")
	private String email;

	@NotBlank(message = "Please provide the role" )
	@Size(min = 5, max = 25, message = "role size should be in range from 5 - 25")
	private String role;
}
