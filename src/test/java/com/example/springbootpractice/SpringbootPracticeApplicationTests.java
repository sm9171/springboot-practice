package com.example.springbootpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(
	properties = {
			"spring.profiles.active=local",
			"jasypt.encryptor.password=sunday8turtle"
	}
)
class SpringbootPracticeApplicationTests {

	@Test
	void contextLoads() {
	}

}
