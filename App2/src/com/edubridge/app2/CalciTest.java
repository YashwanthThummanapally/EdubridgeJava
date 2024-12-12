package com.edubridge.app2;

import com.edubridge.app1.Calci;
import com.edubridge.app3.SICalculator;

public class CalciTest {
	public static void main(String[] args) {
		System.out.println("Square of 10 : " + Calci.findSquare(10));
		System.out.println("Cube of 10 : " + Calci.findCube(10));

		System.out.println("Simple Interest : " + SICalculator.findSimpleInterest(2000.0, 2.5, 2));
	}
}
