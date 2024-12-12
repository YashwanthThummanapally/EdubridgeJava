/*
 * BiConsumer:
 * @FunctionalInterface
 * public interface BiConsumer<T,U>{
 * 		void accept(T x, U y);
 * }
 */
package java8;

import java.util.function.BiConsumer;

public class Test13 {
	public static void main(String[] args) {
		// cancatenate 2 strings
		BiConsumer<String, String> b1 = (s1, s2) -> System.out.println(s1.concat(s2));
		b1.accept("Core", "Java");
		
		// maipulate input
		BiConsumer<String, Integer> b2 = (s, i) -> System.out.println(s.toUpperCase()+(i*2));
		b2.accept("ms dhoni", 7);
		
		BiConsumer<HomePlace, WorkPlace> b3 = (hp, wp) -> {
			System.out.println(hp);
			System.out.println(wp);
		};
		b3.accept(new HomePlace("Siddipet", "TG", 502103), new WorkPlace("Begumpet", "TG", 502091));
	}
}

class HomePlace {
	private String location;
	private String state;
	private int pincode;
	public HomePlace(String location, String state, int pincode) {
		super();
		this.location = location;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "HomePlace [location=" + location + ", state=" + state + ", pincode=" + pincode + "]";
	}
}

class WorkPlace {
	private String location;
	private String state;
	private int pincode;
	public WorkPlace(String location, String state, int pincode) {
		super();
		this.location = location;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "WorkPlace [location=" + location + ", state=" + state + ", pincode=" + pincode + "]";
	}
}