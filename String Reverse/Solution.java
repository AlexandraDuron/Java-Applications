import java.io.*;
import java.util.*;

/* A palindrome is a word, number or a sequence 
 * of units that is able to be read the same way from either direction. This program
 * prints "Yes" if the word is a palindrome. It prints "No" otherwise.*/

public class Solution {

	public static void main(String[] args) {

		String A= "madam";
		
		// StringBuilder creates a mutable sequence of characters.
		// Then, we access the reverse method of StringBuilder. Finally, we 
		// access the toString() method to get a printed version of the object
		// equals method checks for the content of the object and the String A
		if (A.equals(new StringBuilder(A).reverse().toString())){
			System.out.println("Yes"); 
		}
		else{System.out.println("No");}

	}
}