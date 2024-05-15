package com.rental.service.impl;

import org.springframework.stereotype.Service;

import com.rental.dto.ApiResponse;
import com.rental.dto.CarDto;
import com.rental.entity.Car;
import com.rental.exceptions.CarNotFoundException;
import com.rental.exceptions.CustomerCanNotUpdateException;
import com.rental.exceptions.UserNotFoundException;
import com.rental.mapper.CustomMapper;
import com.rental.repository.CarRepository;
import com.rental.repository.UserRepository;
import com.rental.service.CarService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
	
	private final CarRepository carRepository;
	private final UserRepository userRepository;
	
	
	


	@Override
	public ApiResponse createCar(int userId, CarDto carDto) {
		log.info("service method called");
		if(!(userRepository.existsByUserId(userId))) {
			log.info("user not found exception occured");
			throw new UserNotFoundException();
		}
		if(!(userRepository.findByUserId(userId).get().getRole().equals("Admin"))) {
			log.info("Customer not found exception occured");
			throw new CustomerCanNotUpdateException();
		}
		Car newCar = CustomMapper.mapToCar(carDto, new Car());
		
		try {
			carRepository.save(newCar);
			log.info("car data saved in database");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ApiResponse("400","car data not inserted");
		}		
		return new ApiResponse("200","Car data inserted successfully");
				
	}

	@Override
	public ApiResponse updateCar(int userId, int carId, CarDto carDto) {
			log.info("service layer called");
			if(! (userRepository.existsByUserId(userId))) {
				log.info("User not found exception occured");
				throw new UserNotFoundException();
			}
			if(! (carRepository.existsByCarId(carId))) {
				log.info("Car not found exception occured");
				throw new CarNotFoundException();
			}
			if(!(userRepository.findByUserId(userId).get().getRole().equals("Admin"))) {
				log.info("Customer can not update the Car table");
				throw new CustomerCanNotUpdateException();
			}
			Car newCar = CustomMapper.mapToCar(carDto, new Car());
			try {
				carRepository.save(newCar);
				log.info("car data saved in database");
			} catch (Exception e) {
				log.error(e.getMessage());
				return new ApiResponse("400","car data not inserted");
			}		
		return new ApiResponse("200","Car data updated successfully");
	}
}


