package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticCalciTest {
	private ArithmeticCalci calci = null;
	
	@BeforeEach // before each test case executes once
	public void setUp() {
		calci = new ArithmeticCalci();
	}
	
	@AfterEach // executes after every test case
	public void tearUp() {
		calci = null;
	}

	@Test
	public void testSum() {
		int actual = calci.sum(10, 20);
		int expected = 30;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int actual = calci.subtract(10, 20);
		int expected = -10;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int actual = calci.multiply(8, 9);
		int expected = 72;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		float actual = calci.divide(11, 5);
		float expected = 2.2F;
		
		assertEquals(expected, actual);
	}
}
