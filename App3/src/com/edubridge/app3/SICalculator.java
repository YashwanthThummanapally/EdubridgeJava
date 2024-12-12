package com.edubridge.app3;

public class SICalculator {
	public static double findSimpleInterest(double principalAmount, double rateOfInterest, double timePeriod) {
		double simpleInterest = (principalAmount*timePeriod*rateOfInterest)/100;
		return simpleInterest;
	}
}
