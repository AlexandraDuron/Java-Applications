import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/****************************************************************
 *   This code loads the entries from the file "marks.txt", creates and populates two arrays
    (one for matric and one for grade).
 *  
 * **************************************************************/


public class ReadFile {

	//Attributes 
	static List<String> matric = new ArrayList<>();
	static List<String> grades = new ArrayList<>();

	//Read the file and store in ArrayList
	public void loadFile() throws FileNotFoundException{

		String fileName = "marks.txt";
		File file = new File(fileName);
		Scanner inputStream = new Scanner(file);

		while(inputStream.hasNext()) {

			String data = inputStream.nextLine();
			String[] values = data.split("\\s");
			matric.add(String.valueOf(values[0]));
			grades.add(String.valueOf(values[1])); 

		} inputStream.close();

		//Testing that data was stored in arrays
		System.out.println("Testing that the data was loaded and stored in the ArrayList");
		System.out.println(matric);
		System.out.println(grades + "\n");

	}

	//Getters
	public static List<String> getMatric() {

		return matric;
	}

	public static List<String> getGrades(){

		return grades;
	}











}
