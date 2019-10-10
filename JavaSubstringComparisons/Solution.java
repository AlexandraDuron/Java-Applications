/****************************************************************
 *   A substring of a string is a contiguous block of characters 
 *   in the string. For example, the substrings of abc are a, b, c, 
 *   ab, bc, and abc. 
 *   
 *   Given a string, and an integer, I made
 *   a function, so that it finds the lexicographically smallest 
 *   and the largest substrings.
 *   
 *   e.g. 
 *   
 *   String  s  = "welcometojava" has the following lexicographically-ordered substrings of length k=3:
 *   
 *   ava, com, elc, eto,jav, lco, met, oja, ome, toj, wel, ava, wel.
 *   
 *   The challenge's source is: https://www.hackerrank.com/challenges/java-string-compare/problem
 *  
 * **************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static String getSmallestAndLargest(String s, int k) {
		//Make array of substrings
		ArrayList<String> substring = new ArrayList<>();
		for(int i = 0; i<s.length()-k+1; i++){
			substring.add(s.substring(i,k+i));
		}

		//Sort array
		Collections.sort(substring);
		//Get the smallest substring
		String smallest = substring.get(0);
		//Get the largest substring
		String largest = substring.get(substring.size()-1);

		//Print array;
		for(String temp:substring) {
			System.out.println(temp);}

		return "\n" + smallest + "\n" + largest;
	}

	//Test
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;      
		System.out.println(getSmallestAndLargest(s, k));
	}
}
