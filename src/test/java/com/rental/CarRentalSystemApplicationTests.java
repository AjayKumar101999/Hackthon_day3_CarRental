package com.rental;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ComponentScan(basePackages = "com.rental")
@ContextConfiguration
class CarRentalSystemApplicationTests {

	@Test
	void contextLoads() {
	}

}
