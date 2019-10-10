
public class Student extends Person {
	private int graduationYear;
	private double gpa;

	public Student(String firstName, String lastName, int graduationYear, double gpa) {
		super(firstName, lastName);
		this.graduationYear = graduationYear;
		this.gpa=gpa;
	}

	@Override   // Overriding the behavior of the parent class. 
	public void print() {
		System.out.println("\nStudent Details");
		super.print();
		System.out.println("Graduation year: " + graduationYear + " "+ "Grades: " + gpa);

	}


}
