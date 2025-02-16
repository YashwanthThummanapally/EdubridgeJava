/*
 * @FunctionalInterface
 * public interface Supplier<T>{
 * 	T get();
 * 	}
 */
package java8;

import java.util.function.Supplier;

public class Test11 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {return "Java is interesting subject";};
		System.out.println(s1.get());
		
		Supplier<Animal> s2 = () -> new Animal("Lion", 2.2, "Carnivores");
		System.out.println(s2.get());
		
		Supplier<TouristPlace> s3 = () -> new TouristPlace("Ayodhya", "Uttarpradesh", "India");
		System.out.println(s3.get());
	}
}

class Animal {
	private String animalName;
	private double age;
	private String animalType; // herbivores, carnivores, omnivores
	public Animal(String animalName, double age, String animalType) {
		super();
		this.animalName = animalName;
		this.age = age;
		this.animalType = animalType;
	}
	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", age=" + age + ", animalType=" + animalType + "]";
	}	
}

class TouristPlace {
	private String touristPlaceName;
	private String state;
	private String country;
	public TouristPlace(String touristPlaceName, String state, String country) {
		super();
		this.touristPlaceName = touristPlaceName;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "TouristPlace [touristPlaceName=" + touristPlaceName + ", state=" + state + ", country=" + country + "]";
	}
}
