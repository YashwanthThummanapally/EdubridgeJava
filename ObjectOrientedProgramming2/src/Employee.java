/*
 * DTO - Data Transfer Object
 * POJO - Plain Old Java Object
 * Model
 * Entity
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	// setters and getters
	public Employee setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		return this;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public Employee setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
		return this;
	}
}
