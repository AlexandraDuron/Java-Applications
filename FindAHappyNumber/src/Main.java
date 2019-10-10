/****************************************************************
 * A number is called happy if it will yield '1' when it 
 * is replaced by the sum of the square of its digits repeatedly. 
 * 
 * In this program. I have made a method to print 1 if a number is happy, or to 
 * print 0 otherwise. 
 *
 * **************************************************************/


import java.io.File;
import java.io.IOException;
import java.util.*;
public class Main {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {

		String fileName = "data.txt";
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);

		while(scanner.hasNext()){
			int input = Integer.parseInt(scanner.nextLine()); //
			System.out.println(input);
			int square = input * input; // 49
			System.out.println(FindHappyNumber(square));
		}
	}

	public static int FindHappyNumber(int square) {
		String values = String.valueOf(square);
		char[] digits = values.toCharArray();//[4][9]
		int sum = 0;
		for(int i = 0 ; i<digits.length; i++){
			sum = sum + (Character.getNumericValue(digits[i]))*(Character.getNumericValue(digits[i])); 
		} //97
		if(sum==1) {return 1;}

		else {
			try {
				//recursion
				return FindHappyNumber(sum);
				//if the number is not a happy one, it will cause a stack over flow
			}catch(StackOverflowError error) {
				return 0;

			}

		}

	}

}
