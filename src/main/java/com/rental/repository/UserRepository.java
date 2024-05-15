package com.rental.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rental.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{
		public Optional<UserDetails> findByUserId(Integer userId);
		public boolean existsByUserId(Integer userId);
		public UserDetails findByUserEmail(String userEmail);
		public boolean existsByUserEmail(String userEmail);
		
}
