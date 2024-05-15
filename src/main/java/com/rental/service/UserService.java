package com.rental.service;

import com.rental.dto.ApiResponse;
import com.rental.dto.UserDto;


public interface UserService {

	ApiResponse createUser( UserDto userDto);

	

}
