
public class EmployeeService {
	private Employee[] employees = new Employee[10];
	private int size = 0; // no elements 
	
	public int getSize() {
		return this.size;
	}
	
	public void addEmployee(Employee employee) {
		if(size==employees.length) {
			System.out.println("Array is full");
		} else {
			employees[size++] = employee;
		}
	}
	
	public Employee getEmployee(int index) {
		if(index<size) {
			return employees[index];
		}else {
			return null;
		}
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
}
