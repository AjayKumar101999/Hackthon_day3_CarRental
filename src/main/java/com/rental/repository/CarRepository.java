package com.rental.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rental.entity.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

		boolean existsByCarId(Integer carId);
		Optional<Car> findByCarId(Integer carId);

		
	}
