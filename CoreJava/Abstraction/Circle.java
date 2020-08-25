
public class Circle extends Shape{
	private int radius;
	public Circle() {
		
		super("Circle");
		radius=20;
	}
	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	public void display() {
		System.out.println("Circle has a radius of : "+radius);
	}
	public double calculateArea()  {
		return radius*radius*3.14;
		
	}
}
