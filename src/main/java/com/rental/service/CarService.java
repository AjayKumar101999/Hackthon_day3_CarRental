package com.rental.service;

import com.rental.dto.ApiResponse;
import com.rental.dto.CarDto;

public interface CarService {

	ApiResponse createCar( int userId, CarDto carDto);

	ApiResponse updateCar( int userId, int carId, CarDto carDto);
}
