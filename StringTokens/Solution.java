/* This code splits the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, we print the number of tokens and each token on a new line.*/

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		String[] tokens;
		String input = "He is a very very good boy, isn't he?";
		Scanner scan = new Scanner(input);
		int numTokens=0;
		while(scan.hasNext()){
			String s = scan.nextLine();
			tokens = s.split("[^a-zA-Z]+");
			for(String temp:tokens){
				System.out.println(temp);
				numTokens++;
			}
		}scan.close();
		System.out.println("Number of tokens "+numTokens);

	}
}


