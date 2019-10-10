/****************************************************************
 *  We build a helper method to search through the two arrays to find the matric
corresponding to the highest grade. 

Grades are a letter followed by a number where A is the highest letter and the 
lower the number the better. For example, A2 is better than C1 and B1 is better than B2.
 *  
 * **************************************************************/

public class HighestGrade {
	String matricHighestGrade;

	public void findHighestGrade(){
		char maxLetter = ReadFile.getGrades().get(0).charAt(0);		
		char maxNumber = ReadFile.getGrades().get(0).charAt(1);

		//First, we put the letter with the highest in the top of the array.
		for(int i=0; i<ReadFile.getGrades().size(); i++) {
			if(maxLetter >= ReadFile.getGrades().get(i).charAt(0)) {
				maxLetter = ReadFile.getGrades().get(i).charAt(0);

				//Now, we check for the numerical value of the letters with the highest value.
				if(maxNumber> ReadFile.getGrades().get(i).charAt(1)){
					maxNumber = ReadFile.getGrades().get(i).charAt(1);
					matricHighestGrade = ReadFile.getMatric().get(0);
				}


			}		

		}

		System.out.println("The highest grade is:" + maxLetter + maxNumber + " The matric of the student with the highest grade is; "+  matricHighestGrade + "\n");

	}

}
