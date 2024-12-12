package java8;

class Accept<T> {
	private T variable;

	public Accept(T variable) {
		super();
		this.variable = variable;
	}

	public T getVariable() {
		return this.variable;
	}
}

public class Test7 {
	public static void main(String[] args) {
		Accept<Integer> accept1 = new Accept<Integer>(100);
		System.out.println(accept1.getVariable());

		Accept<String> accept2 = new Accept<String>("Java");
		System.out.println(accept2.getVariable());

		Accept<Double> accept3 = new Accept<Double>(98.2);
		System.out.println(accept3.getVariable());
		
		Accept<Order> accept4 = new Accept<Order>(new Order("ORD738", "Yoshitha", 678.9));
		System.out.println(accept4.getVariable());
	}
}

class Order {
	private String orderId;
	private String customerName;
	private double billAmount;

	public Order(String orderId, String customerName, double billAmount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", billAmount=" + billAmount + "]";
	}
}
