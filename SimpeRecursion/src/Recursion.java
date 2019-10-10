
public class Recursion {

	public static int reduceBYOne(int n) {

		if(n>0) {
			return   reduceBYOne(n-1)-n ;
		}

		return n;

	}

	public static void main(String[] args) {

		System.out.println(reduceBYOne(10));

	}

}

//make an example for factorial

//public class Recursion {
//
//	public static int Factorial(int n) {
//
//		if(n>1) {
//			return n * Factorial(n-1) ;
//		}
//
//		return n;
//
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(Factorial(5));
//
//	}
//
//}
