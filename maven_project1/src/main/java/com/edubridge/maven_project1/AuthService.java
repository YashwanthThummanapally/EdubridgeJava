package com.edubridge.maven_project1;

public class AuthService {
	String username = "admin";
	String userPassword = "admin123";

	public boolean authenticate(String username, String userPassword) {
		if (username.equals(this.username) && this.userPassword.equals(userPassword)) {
			return true;
		} else {
			return false;
		}
	}
}
