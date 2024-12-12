package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
	private static AuthService auth;
	
	@BeforeAll // executes before all test cases at once
	public static void setUp() {
		auth = new AuthService();
		System.out.println("AuthServiceTest.setUp()");	
	}
	
	@AfterAll
	public static void tearUp() {
		auth = null;
		System.out.println("AuthServiceTest.tearUp()");
	}
	
	@Disabled
	@Test
	@DisplayName("check with valid data")
	public void testAuthenticateWithValidData() {
		System.out.println("AuthServiceTest.testAuthenticateWithValidData()");
		boolean actual = auth.authenticate("admin", "admin123");
		
		assertTrue(actual);
	}
	
	@Test
	@DisplayName("check with invalid data")
	public void testAuthenticateWithInValidData() {
		System.out.println("AuthServiceTest.testAuthenticateWithInValidData()");
		boolean actual = auth.authenticate("admin", "admin");
		
		assertFalse(actual);
	}
}
