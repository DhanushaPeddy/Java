public class Student {
	private String name;
	private String identifier;
	private int age;
	private int marks1;
	private int marks2;
	private int marks3;
	private int standard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks(int marks1) {
		this.marks1 = marks1;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public void display() {
		System.out.println("Name : "+getName()+"\t Age : "+getAge()+"\t Marks 1 : "+getMarks1()+"\t Marks 2 : "+getMarks2()+"\t Marks 3 : "+getMarks3());
	}
	public Student() {
		name = "Dhanusha";
		identifier = "Test";
		age = 21;
		standard = 12;
		marks1 = 98;
		marks2 = 86;
		marks3 = 97;		
	}
	public Student(String name,String identifier,int age,int standard,int marks1,int marks2,int marks3) {
		this.name = name;
		this.identifier = identifier;
		this.age = age;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.standard = standard;
	}
	public int total() {
		return marks1+marks2+marks3;
	}
}
