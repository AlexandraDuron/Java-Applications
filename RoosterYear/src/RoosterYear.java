import java.util.Scanner;

/****************************************************************
 * According to the Chinese Horoscope, 1909 was a Rooster Year. Since then, there has
been a rooster year every 12 years, i.e., in 1921, 1933, 1945, 1957, 1969, 1981,
1993, 2005, and 2017.  isRoosterYear is a helper method that takes as input an
integer number year between 1900 and 2017 (included), and returns a boolean
variable roosterYear which is true if year is a Rooster Year and false otherwise.

 * **************************************************************/

public class RoosterYear {

	//Atributes
	private int year;

	//helper method
	public static boolean isRoosterYear(int year) {

		boolean rooster=false;
		//Checking for the first roosterYear
		if (year == 1909)
		{rooster=true;}

		else {
			// Checking for the rest of the roosterYears since 1909.	
			for(int i=1909; i<=2017; i+=12) {
				if(year==i) {
					rooster=true;
				}}}

		return rooster;

	}


	//	Test
	public static void main(String[] args) {

		//Ask for the user for typing a year.
		while(true) {
			Scanner c = new Scanner(System.in); 
			System.out.println(" Hello! please type your name:  "); // Scanning custumer's balance
			String name = c.nextLine();
			System.out.println("Welcome :" + name +" "+ "please type a year between 1900 and 2017 (included): "); // Message for the custumer to inform about balance status
			int year = c.nextInt();
			//Pass year selected through the method
			System.out.println(isRoosterYear(year));
		}

	}

}
