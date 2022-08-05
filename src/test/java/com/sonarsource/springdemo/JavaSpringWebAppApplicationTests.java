package com.sonarsource.springdemo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaSpringWebAppApplicationTests {

	@Autowired
	private AppController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
