/*
 * @FunctionalInterface
 * public interface Function<T,R>{
 * 		R apply(T x);
 */
package java8;

import java.util.function.Function;

public class Test10 {
	public static void main(String[] args) {
		// square of a number
		Function<Integer, Integer> f1 = num -> num * num;
		System.out.println(f1.apply(5));

		// find length of the string
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Yogi adityanath"));

		// check name starts with R
		Function<String, Boolean> f3 = s -> s.startsWith("R");
		System.out.println(f3.apply("Ranganath"));

		// find number of elements in an array
		Function<Integer[], Integer> f4 = arr -> arr.length;
		System.out.println(f4.apply(new Integer[] { 5, 4, 6, 7, 8, 3, 2, 2 }));
		
		// get salesman salary based on salesman name
		Function<Salesman, Double> f5 = sm -> sm.getSalary();
		System.out.println(f5.apply(new Salesman("Kapil", "Flipkart", 34500.0)));
		
		// string to int
//		Function<String, Integer> f6 = s -> Integer.parseInt(s);
		Function<String, Integer> f6 = Integer::parseInt;
		System.out.println(f6.apply("45"));
	}
}

class Salesman {
	private String name;
	private String company;
	private double salary;

	public Salesman(String name, String company, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
