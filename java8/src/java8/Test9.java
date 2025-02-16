/*
 * @FunctionalInterface
 * public interface Consumer<T>{
 * 		void accept(T x);
 * 	}
 */

package java8;

import java.util.function.Consumer;

public class Test9 {
	public static void main(String[] args) {
		Consumer<Integer> c1 = age -> System.out.println(age);
		c1.accept(23);

		Consumer<String> c2 = name -> System.out.println(name);
		c2.accept("Raghu");

		Consumer<Boolean> c3 = isEmployed -> System.out.println(isEmployed);
		c3.accept(false);
		
		Consumer<Table> c4 = table -> System.out.println(table);
		c4.accept(new Table("Brown", "NilKamal", 5600.0));
	}
}

class Table {
	private String tableColor;
	private String company;
	private double price;

	public Table(String tableColor, String company, double price) {
		super();
		this.tableColor = tableColor;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Table [tableColor=" + tableColor + ", company=" + company + ", price=" + price + "]";
	}
}
