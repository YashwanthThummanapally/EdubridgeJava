/*
 * In Java, a static import statement allows you to access static members (fields and methods) of a class directly, without specifying the class name.
Syntax:
 */
package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalciTest {
	
	private Calci calci = null;
	
	@BeforeEach
	public void setUp() {
		calci = new Calci();
		System.out.println("CalciTest.setUp()");
	}
	
	@AfterEach
	public void tearUp() {
		calci = null;
		System.out.println("CalciTest.tearUp()");
	}

	@Test
	public void testFindSquare() {
		System.out.println("CalciTest.testFindSquare()");
		int actual = calci.findSquare(10);
		int expected = 100;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindCube() {
		System.out.println("CalciTest.testFindCube()");
		int actual = calci.findCube(10);
		int expected = 1000;
		
		assertEquals(expected, actual);
	}
}
