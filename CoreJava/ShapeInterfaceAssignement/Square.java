
public class Square extends Shape implements Calculatable{
	private double side;

	public Square(double side) {
		super();
		this.side = side;
		display();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square : "+area());
		System.out.println("Perimter of Square : "+perimeter());
	}
	public double area() {
		return side*side;
	}
	public double perimeter() {
		return 4*side;
	}
}
