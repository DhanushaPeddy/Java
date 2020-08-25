
public class StudentManipulation {
	Student[] createStudents() {
		Student[] students = new Student[5];
		students[0] = new Student("Dhanusha", "One", 12, 8, 98, 89, 87);
		students[1] = new Student("Karthik", "Two", 14, 10, 96, 87, 84);
		students[2] = new Student("Harisha", "Three", 12, 8, 93, 78, 90);
		students[3] = new Student("Ranjeeth", "Four", 13, 9, 97, 98, 99);
		students[4] = new Student("Shirisha", "Five", 11, 7, 90, 91, 92);
		return students;
	}

	public int findMax(Student[] students) {
		int max = 0;
		for (Student s : students) {
			if (s.total() > max) {
				max = s.total();
			}
		}
		return max;
	}
}
