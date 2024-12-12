package java8;

@FunctionalInterface
interface Worker {
	void work();
}

class GoldSmith {
	void prepareGold() {
		System.out.println("Prepares neclace, rings, bracelate, watch, wristband");
	}
}

class Carpenter {
	static void carpentry() {
		System.out.println("Does carpentry work to prepare furnitures");
	}
}

public class Test6 {
	public static void main(String[] args) {
//		Worker w = () -> System.out.println("Goldsmith is preparing gold ornaments");
		 
//		Worker w = () -> new GoldSmith().prepareGold();
		
		Worker w = new GoldSmith()::prepareGold;
		w.work();
		
//		Worker w2 = () -> Carpenter.carpentry();
		Worker w2 = Carpenter::carpentry;
		w2.work();
	}
}
