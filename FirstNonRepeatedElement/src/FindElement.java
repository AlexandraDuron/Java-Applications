/****************************************************************
 * Find the first non-repeated element in a String     
 * **************************************************************/

import java.util.HashSet;

public class FindElement{

	//Attributes
	HashSet<Character> repeated = new HashSet<Character>(); 

	void findNonRepeated(String s){
		//Make an array with the elements of the string.
		char[] A = s.toLowerCase().toCharArray();

		try {	
			//Check for empty input
		}catch(ArrayIndexOutOfBoundsException e) {}

		boolean notEqual = true;
		char nonRepated=0;
		int start=0;
		int startNext=1;

		while(true){	
			for(int i=startNext; i<A.length; i++){
				if(A[start]==A[i]){
					notEqual=false;
					repeated.add(A[i]);
				}
				if(repeated.contains(A[startNext])||repeated.contains(A[start])) {
					notEqual=false;
				}
			}
			if(notEqual){
				nonRepated=A[start];
				System.out.println(nonRepated);
				break;
			}
			start++;
			startNext++;
			//Exit loop after traversing the whole array
			if(startNext!=A.length){
				notEqual = true;
			}
			else{	
				if(!repeated.contains(A[A.length-1])){
					nonRepated=A[A.length-1];
					System.out.println(nonRepated);
				}
				break;
			}
		}
	}

	//Test section
	public static void main(String[] args){
		FindElement f= new FindElement();
		String s = "tooth";
		f.findNonRepeated(s);
	}
}
