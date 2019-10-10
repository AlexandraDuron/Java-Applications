
/****************************************************************
 * findPrimeNumbers is a method that prints on the screen all the prime numbers
       between 1 and 100 (included). A prime number is an integer number that can be divided
       exactly only by 1 and by itself: For example, 7 is a prime number because can be
       divided exactly only by 1 and by 7, while 8 is not a prime number because it can be
       divided exactly by 1, by 2, by 4 and by 8. 

 * Variable cont checks for the number of times that the mod equals to zero. 
	   If the mod is equal to zero only once, it means the number can be divided only by itself and by one.
 *
 * **************************************************************/

public class PrimeNumbers {

	public static void findPrimeNumbers() {

		for (int i=1; i<=100; i++) {

			// Skip 1, because it's not a prime number.
			if(i!=1) {
				//cont is reset to zero 
				int cont=0;
				for(int j=2; j<=i; j++) {
					if(i%j==0) {
						cont++;
					}
				}

				if(cont<2) {
					System.out.println(i);
				}
			}
		}

	}


	public static void main(String[] args) {

		findPrimeNumbers();

	}

}
