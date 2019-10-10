import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

/****************************************************************
 *  Main class to initialize classes and make an ArrayList of student objects
 *   
 * **************************************************************/


public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {

		//Initialize ReadFile class and load the "marks.txt" file. 
		ReadFile file =new ReadFile();
		file.loadFile();

		//Initialize the class that finds the highest grade with for loops.
		HighestGrade grade = new HighestGrade();
		grade.findHighestGrade();


		//Make an ArrayList of student objects and pass the grade (letter and number) through the StudentGrade class.   
		ArrayList<StudentGrade> students = new ArrayList<StudentGrade>();

		students.add(new StudentGrade(ReadFile.getMatric().get(0),ReadFile.getGrades().get(0))); 
		students.add(new StudentGrade(ReadFile.getMatric().get(1),ReadFile.getGrades().get(1))); 
		students.add(new StudentGrade(ReadFile.getMatric().get(2),ReadFile.getGrades().get(2))); 
		students.add(new StudentGrade(ReadFile.getMatric().get(3),ReadFile.getGrades().get(3))); 
		students.add(new StudentGrade(ReadFile.getMatric().get(4),ReadFile.getGrades().get(4))); 

		System.out.println("Sorting using comparable interface");

		//Sorting by grades (Ascending Order)
		Collections.sort(students);

		//Use Comparator interface to sort by matric 
		//System.out.println("Sorting using Comparator interface");
		//Collections.sort(students,new MatricSorter());

		for(StudentGrade g:students) 
		{System.out.println(g);}


	}

}
