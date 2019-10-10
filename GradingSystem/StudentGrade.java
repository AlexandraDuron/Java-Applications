import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

/****************************************************************
 * Creating an object that stores the data for a single student.
 * (An alternative solution for sorting)
 *  
 * **************************************************************/

public class StudentGrade implements Comparable<StudentGrade>{

	//Attributes
	String  matric, grades;

	//Constructor to pass the data from the .txt file	
	public StudentGrade(String matric, String grade) {

		this.matric=matric;
		this.grades=grade;

	}

	//Sorting grades
	public int compareTo(StudentGrade o) {

		int i = 0;
		if (grades.charAt(0) > o.grades.charAt(0)) {i= 1;} 

		else if (grades.charAt(0) == o.grades.charAt(0) && grades.charAt(1) > o.grades.charAt(1)) {i= 1;} 

		else {i= -1;}

		return i;
	}

	//Getters
	public String getMatric() {
		return matric;
	}

	public String getGrades() {
		return grades;
	}

	//Nice display
	public String toString() {
		return "Matric: " + matric + " Grade: " + grades;
	}
}
