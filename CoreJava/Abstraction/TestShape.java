public class TestShape {

	public static void main(String[] args) {
		// Shape s = new Shape();-->Abstract class
		// Circle c1 = new Circle();
		// System.out.println(c1.calculateArea());
		Shape s;
		s = new Circle(10); //upcasting(implicitly)
		System.out.println(s.calculateArea());
		((Circle)s).display(); //downcasting(explicitly)
//		show(s);
	}
//	static void show(Circle c) {
//		System.out.println("Circle obj");
//		c.calculateArea();
//	}
	//You cannot add on new shapes...below one holds all its child classes objects
//	static void show(Shape c) {
//		System.out.println("Shape obj");
//		c.calculateArea();
//	}
}
