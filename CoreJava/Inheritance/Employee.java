
public class Employee {
	private int empId;
	private String empName;

	public Employee() {
		System.out.println("Emp");
		empId = 123;
		empName = "SuperClass";
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void display() {
		System.out.println("Emp ID : " + empId + "\tEmp Name : " + empName);
	}
}
