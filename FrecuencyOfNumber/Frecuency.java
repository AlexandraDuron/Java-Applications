
/****************************************************************
 *   A short method to check for the frequency of numbers in an array
 *  
 * **************************************************************/

import java.io.*; 
import java.util.*; 

public class Frecuency {

	//Attributes
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

	//Method to check for frequency
	int checkFrecuency(int a[], int m) {
		int frequency = 0;
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])){
				//If the value of the key is repeated, replace it to sum 1 to the frequency
				map.replace(a[i], (map.get(a[i]))+1);
			}
			//Map an initial value to the key (it will work like the frequency)
			else {map.put(a[i],1);
			}
		}
		//check if the int m is in the hash map, if so, returns its value
		if(map.containsKey(m)) {
			frequency = map.get(m);
		}

		return frequency;
	}

	//test
	public static void main(String[] args) {

		int a[] = {1,2,2,2,3};
		Frecuency f = new Frecuency ();
		System.out.println(f.checkFrecuency(a,2));
	}

}
