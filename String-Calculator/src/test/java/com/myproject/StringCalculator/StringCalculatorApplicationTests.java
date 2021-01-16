package com.myproject.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testAddForEmptyString() {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add(""),0);
	}
	@Test
	void testAddForOneNUm() {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1"),1);
	}
	@Test
	void testAddForTwoNums() {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1,2"),3);
	}
	
}

