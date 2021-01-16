package com.myproject.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.myproject.StringCalculator.ExceptionHandling.NegativeNumException;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testAddForEmptyString() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add(""),0);
	}
	@Test
	void testAddForOneNUm() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1"),1);
	}
	@Test
	void testAddForTwoNums() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1,2"),3);
	}
	@Test
	void testAddForUnknownNums() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1,2,67,45,887,5"),1007);
	}
	@Test
	void testAddForHandlingNewLinesBtwnNums() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("1,45\n6,8"),60);
	}
	@Test
	void testAddForHandlingDefaultDelimiter() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertEquals(s.Add("//;\n1;45;6;8"),60);
	}
	@Test
	void testAddForHandlingNegativeNumbs() throws NegativeNumException {
		StringCalculator s=new StringCalculator();
		assertNotEquals(s.Add("//;\n1;-45;6;-8"),60);
	}
}

