
public class SalariedEmployee extends Employee {
	private long salary;
	private double incentives;
	private double ta;
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public SalariedEmployee() {
		super();
		salary = 45000;
		incentives = 4000;
		ta = 2000;
	}
	public SalariedEmployee(int empId, String empName,long salary,double incentives,double ta) {
		super(empId,empName);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}
	public void display() {
		super.display();
		System.out.println("Salary is :"+salary+"\tIncentives:"+incentives+"\tTax:"+ta);
		System.out.println("Total Salary : "+totalSalary());
	}
	public double totalSalary() {
		return salary+incentives+ta;
	}
}
