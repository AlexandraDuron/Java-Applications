
/* This program loads player's data (name and score), from a .csv file, and
 * stores the data in an array of  player objects. A comparator sorts the players
 * in order of decreasing score. If players have the same score, 
 * the program sorts them alphabetically by name.  */ 

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	//Test 
	public static void main(String[] args) {

		Checker checker = new Checker();
		StoreData store = new StoreData();
		try {
			store.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
		}
		//Sort players
		Collections.sort(StoreData.getPayer(),checker);        
		for(Player p: StoreData.getPayer()) {
			System.out.println(p);
		}
	}
}


