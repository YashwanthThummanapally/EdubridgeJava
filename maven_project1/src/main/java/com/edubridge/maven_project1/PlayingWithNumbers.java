package com.edubridge.maven_project1;

public class PlayingWithNumbers {

	public int reverse(int num) {
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + (num%10);
		}
		return rev;
	}
}
