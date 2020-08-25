
abstract public class Shape {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shape() {
		name = "CDK";
	}
	public Shape(String name) {
		super();
		this.name=name;
	}
	abstract public double calculateArea();
}
