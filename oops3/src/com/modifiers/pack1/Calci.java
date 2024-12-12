package com.modifiers.pack1;
//Illegal modifier for the class Calci; only public, abstract & final are permitted
public class Calci { // default private public
	// default scope - within package
	int x = 10;

	// private scope - only within class
	private int y = 20;

	// public scope - anywhere
	public int z = 30;
	
	// protected scope
	protected int i = 111;
	
	// default scope
	void findSquare(int num) {
		System.out.println(num * num);

		System.out.println(y);
		findCube(num);
	}
	
	private void findCube(int num) {
		System.out.println(num*num*num);
	}
	
	public void findSum(int x, int y) {
		System.out.println("Sum = "+(x+y));
	}
	
	protected void findProduct(int x, int y) {
		System.out.println(x*y);
	}
}
