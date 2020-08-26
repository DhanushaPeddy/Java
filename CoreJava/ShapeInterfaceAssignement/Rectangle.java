
public class Rectangle extends Shape implements Calculatable{
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		display();
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of " +getName()+" : "+area());
		System.out.println("Perimeter of " +getName()+" : "+perimeter());
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
}
