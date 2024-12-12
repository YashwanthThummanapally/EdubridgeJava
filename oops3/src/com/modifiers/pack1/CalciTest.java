package com.modifiers.pack1;

public class CalciTest {
	public static void main(String[] args) {
		Calci c = new Calci();
		System.out.println(c.x);
		c.findSquare(10);
		
		// private scope
		System.out.println(c.y);
		c.findCube(10);
		
		// public 
		System.out.println(c.z);
		c.findSum(10, 20);
		
		// protected member access
		System.out.println(c.i);
		c.findProduct(5, 10);
	}
}
