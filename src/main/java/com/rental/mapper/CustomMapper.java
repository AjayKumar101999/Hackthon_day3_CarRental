package com.rental.mapper;

import com.rental.dto.CarDto;
import com.rental.dto.UserDto;
import com.rental.entity.Car;
import com.rental.entity.UserDetails;

public class CustomMapper {

	public static UserDetails mapToUser(UserDto userDto, UserDetails user) {
		
		user.setRole(userDto.getRole());
		user.setUserEmail(userDto.getEmail());
		user.setUserName(userDto.getUserName());
		
		return user;
	}
	
	
	public static Car mapToCar(CarDto carDto, Car car) {
		
		car.setCarName(carDto.getCarName());
		car.setCarPrice(carDto.getCarPrice());
		car.setCarType(carDto.getCarType());
		car.setQuantity(carDto.getQuantity());
		
		return car;
	}
	

}
