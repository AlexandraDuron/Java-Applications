
/****************************************************************
 * A simple example to use exceptions
 * catch an unwanted event where a division of two integers can not be carry out
 
 * **************************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		while(true) {
			try{
				System.out.println("Please enter a dividend");
				Scanner scanner = new Scanner(System.in);
				int input1 = scanner.nextInt();

				System.out.println("Please enter a divisor");
				Scanner scanner2 = new Scanner(System.in);
				int input2 = scanner2.nextInt();
				int result = input1/input2;
				System.out.println("Result: "+ result);
				
				//Catch any input that is not an integer number
			}catch(InputMismatchException e){
				//Print the exception type
				e.printStackTrace(); 
				System.out.println("Please enter an integer number");
			}catch(ArithmeticException e){
				//Catch a "0" input 
				System.out.println("Please don't enter 0 for a divisor");
				//Print the exception type
				e.printStackTrace();
			//Catch any other error
			}catch(Exception e){
				System.out.println("Please try again");
			}

		}

	}

}
