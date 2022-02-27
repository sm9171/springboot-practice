package com.example.springbootpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(properties = {
		"jasypt.encryptor.password=sunday8turtle"})
@ActiveProfiles("local")
class SpringbootPracticeApplicationTests {

	@Test
	void contextLoads() {
	}

}
