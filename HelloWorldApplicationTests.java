package com.kumoco.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	void sampleTest() {

		assertTrue("Sample test... ", true);
	}

}
