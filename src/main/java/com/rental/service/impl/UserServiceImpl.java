package com.rental.service.impl;

import org.springframework.stereotype.Service;

import com.rental.dto.ApiResponse;
import com.rental.dto.UserDto;
import com.rental.entity.UserDetails;
import com.rental.exceptions.UserRegisteredAlreadyException;
import com.rental.mapper.CustomMapper;
import com.rental.repository.UserRepository;
import com.rental.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

	@Override
	public ApiResponse createUser(UserDto user) {
			log.info("service method called");
			if (userRepository.existsByUserEmail(user.getEmail())) {
				log.info("User already registerd exception");
				throw new UserRegisteredAlreadyException("User already registered");
			}
			UserDetails newUser = CustomMapper.mapToUser(user, new UserDetails());
			try {
				userRepository.save(newUser);
				log.info("user data saved in database");
			} catch (Exception e) {
				log.error(e.getMessage());
				return new ApiResponse("400","User data not inserted");
			}		
			return new ApiResponse("200","User data inserted successfully");
				
		}

		
}
