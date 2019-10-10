

/****************************************************************
 * This code finds a factorial number using recursion.
 
 * **************************************************************/

public class RecursionFactorial {

	public static int findFactorial(int n) {
       
		
		if(n>1) {

			return n * findFactorial(n-1);
		}

		return n;

	}

	public static void main(String[] arg) 
	{
		System.out.println(findFactorial(5));
	}

}
