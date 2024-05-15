package com.rental.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.rental.entity.Car;

@DataJpaTest
class CarRepositoryTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	Car car;
	
	@BeforeEach
	void setup() {
		car=new Car();
		car.setCarId(100);
		car.setCarName("Acura");
		car.setCarPrice(200000.00);
		car.setCarType("suv");
		car.setQuantity(2);
		entityManager.persist(car);
	}
	
//	@AfterEach
//	void tearDown() {
//		car=null;
//		carRepository.deleteAll();
//	}
	
	@Test
	void testExistsByCarId() {
		int id=123;
		
		boolean existsByCarId = carRepository.existsByCarId(id);
		//when(carRepository.existsByCarId(125)).thenReturn(true);
		//assertThat(carRepository.existsByCarId(125)).isTrue();
		assertThat(existsByCarId).isTrue();
		
	}
}
