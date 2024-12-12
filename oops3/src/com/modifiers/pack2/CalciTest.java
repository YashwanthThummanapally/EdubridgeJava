package com.modifiers.pack2;

import com.modifiers.pack1.Calci;

public class CalciTest extends Calci{
	public static void main(String[] args) {
		Calci c = new Calci();
		// default members not accessible outside the package
		System.out.println(c.x);
		c.findSquare(10);
		
		// accessing public members
		System.out.println(c.z);
		c.findSum(10, 20);
		
		// accessing protected members with 
		System.out.println(c.i);  
		c.findProduct(10, 3);
		
		// accessing protected members
		CalciTest ct = new CalciTest();
		System.out.println(ct.i);
		ct.findProduct(10, 5);
	}
}
