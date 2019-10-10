import java.util.Comparator;

/****************************************************************
 *   This is an example of how to implement the Comparator interface. 
 *   We use it here to sort students' matrics
 *  
 * **************************************************************/


public class MatricSorter implements Comparator<StudentGrade>{

	public int compare(StudentGrade o1, StudentGrade o2) {

		// Making the String "matric" an int , so we can sort it with the compare method.
		int gradeNumbero1 = Integer.parseInt(o1.getMatric());
		int gradeNumbero2 = Integer.parseInt(o2.getMatric());

		return gradeNumbero1 - gradeNumbero2;
	}

}
