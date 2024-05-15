package com.rental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rental.dto.ApiResponse;
import com.rental.dto.CarDto;
import com.rental.dto.UserDto;
import com.rental.service.CarService;
import com.rental.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Tag(
        name = "CRUD REST APIs for Car Rental Application"
        )

@RestController
@RequestMapping(path = "/api/v1")
@Validated
@RequiredArgsConstructor
public class CarController {

	private final CarService carService;
	private final UserService userService;

	/**
	 * this method will create the userDetails in database
	 * @param  UserDto which contain the information of user data.
	 * @return
	 */
	@Operation(summary = " API to insert User details in database")
	@PostMapping("/users")
	public ResponseEntity<ApiResponse> createUser(@Valid @RequestBody UserDto userDto) {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(userService.createUser(userDto));
	} 
	
	
	/**
	 * this Method will create the car details in database
	 * @param userId
	 * @param carDto
	 * @return
	 */
	@Operation(summary = " API to insert the Car details in Car table " )
	@PostMapping("/cars/{userId}")
	public ResponseEntity<ApiResponse> createCar(@Valid @PathVariable int userId, @RequestBody CarDto carDto) {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(carService.createCar(userId,carDto));
	}
	
	/**
	 * 
	 * @param userId
	 * @param carId
	 * @param carDto
	 * @return
	 */
	@Operation(summary = "API to update the Car details into car table ")
	@PutMapping("/cars/{userId}/{carId}")
	public ResponseEntity<ApiResponse> updateCar(@Valid @PathVariable int userId, @PathVariable int carId,  @RequestBody CarDto carDto) {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(carService.updateCar(userId, carId, carDto));
	
	}
}
