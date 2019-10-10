/* Two strings,  and , are called anagrams if they contain all the same 
 * characters in the same frequencies. For example, the anagrams of 
 * CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * 
 * I have made a method that prints "Anagrams"; otherwise, print "Not Anagrams" instead,
 * If  two strings  are case-insensitive anagrams,
 
 Source: https://www.hackerrank.com/challenges/java-anagrams/problem
 */

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String a, String b) {

		boolean x= true;
		//Make an array of chars after converting the Strings into sequences of characters.
		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);

		for(int i=0; i<A.length; i++){
			if(A[i]==B[i]){
				x=true;
			}
			else{x = false;}
		}

		return x;

	}

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		String a = "anagramm";
		String b = "marganaa";
		//scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
