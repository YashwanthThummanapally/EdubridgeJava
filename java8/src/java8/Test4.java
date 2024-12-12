package java8;

@FunctionalInterface
interface Movable {
	void move();
}

public class Test4 {
	public static void main(String[] args) {
		Movable bike = () -> System.out.println("Moves with 2 wheels");
		Movable auto = () -> System.out.println("Moves with 3 wheels");
		Movable car = () -> System.out.println("Moves with 4 wheels");
		
		bike.move();
		auto.move();
		car.move();
	}
}
