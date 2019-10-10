import java.util.Scanner;

/*  

In this program I simulate a variant of the classic whack-a-mole game: 
e.g.  https://giphy.com/gifs/gifporn-MVUyVpyjakkRW

Begin by creating a 5 by 5 grid where I randomly place the moles. Placing a total of 10 moles.
The code allows the user to enter the x and y coordinates of where they
would like to take a whack. 
 
At any point in the game, they can input coordinates of -1, -1 in order to indicate that they 
are giving up. If the user gives up they get to see the entire grid.  

 */


// Main method
public class Main {

	public static void main(String[] args) {
		
		//Start game	
		WhackAMole game = new WhackAMole(5);
		Grid grid = new Grid ();
		grid.populate();
		grid.gridAllHide();
		
		while(true) {
			//Let the user to take a whack
			System.out.println("\nPlease enter the x  of where you would like to take a whack");
			Scanner a = new Scanner(System.in);    
			int y = a.nextInt();  

			System.out.println("\nPlease enter the y  of where you would like to take a whack");
			Scanner b = new Scanner(System.in);    
			int x = b.nextInt();   
			//Give the option to exit the game and show where the moles are.
			if(x==-1 && y == -1) {
				System.out.println("\nYou have given up :( !! This is the location of the moles \n");
				grid.printGrid();
				System.exit(0); 
			}
			//Check for a valid coordinate 
			else if(x>=5||y>=5) {
			System.out.println("\nPlease enter a valid coordinate (less than 5) \n");	
			}
			else  {		
				game.whack(x,y);
				grid.printGridToUser();				
			}
		}
	}

}
