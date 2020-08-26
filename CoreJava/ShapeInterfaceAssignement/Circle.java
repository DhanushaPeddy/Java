
public class Circle extends Shape implements Calculatable {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
		display();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle : "+area());
		System.out.println("Perimeter of circle : "+perimeter());
	}
	public double area() {
		return 3.14*radius*radius;
	}
	public double perimeter() {
		return 6.14*radius;
	}
}
