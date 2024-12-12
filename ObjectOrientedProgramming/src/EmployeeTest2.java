// Object class methods
public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Jones", 45000.0);
		Employee employee2 = new Employee(1003, "Wills", 67000.0);
		
		// toString() of object class : overriding toString()
		// getClass().getName() + "@" + Integer.toHexString(hashCode());
		// hashcode : address of objectc
		System.out.println(employee1); // Employee@4617c264
		System.out.println(employee1.toString()); // Employee@4617c264
		System.out.println(employee2); // Employee@36baf30c
		System.out.println(employee2.toString()); // Employee@36baf30c
		
		System.out.println(employee1.hashCode());
		System.out.println(Integer.toHexString(employee1.hashCode()));
		System.out.println(employee2.hashCode());
		System.out.println(Integer.toHexString(employee2.hashCode()));
	}
}
