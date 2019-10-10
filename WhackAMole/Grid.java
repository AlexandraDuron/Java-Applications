import java.util.Random;

public class Grid {

	//Show a grid with all moles hidden
	void gridAllHide(){

		for(int i=0; i<WhackAMole.getGrid().length; i++) {
			for (int j = 0; j<WhackAMole.getGrid().length; j++) {
				System.out.print(" * ");
			}	
			System.out.println();
		}	
	}


	//Populate 2D array
	void populate() {

		for(int i=0; i<WhackAMole.getGrid().length; i++) {
			for (int j = 0; j<WhackAMole.getGrid().length; j++) {
				WhackAMole.getGrid()[i][j]= '*';	
			}			
		}
		//put the moles "M" in random spots 
		Random rand = new Random(); 	
		for(int i=0; i<=10; i++) {
			int n = rand.nextInt(5);
			int m = rand.nextInt(5);
			WhackAMole.getGrid()[n][m] = 'M';			
		}
	}

	//Print the grid completely. This is effectively dumping the 2d array on the screen. 
	//The places where the moles are should be printed as an ‘M’. 
	//The places where the moles have been whacked should be printed as a ‘W’.
	//The places that don’t have a mole should be printed as *.
	void printGrid() {

		for(int i=0; i<WhackAMole.getGrid().length; i++) {
			for (int j = 0; j<WhackAMole.getGrid().length; j++) {

				System.out.print(WhackAMole.getGrid()[i][j]+ "  ");
			}	
			System.out.println();
		}
	}


	// Print the grid without showing where the moles are. 
	void printGridToUser() {

		//Record a whacked mole.
		for( int i=0; i<WhackAMole.getGrid().length; i++) {
			for (int j = 0; j<WhackAMole.getGrid().length; j++) {
				if(WhackAMole.getGrid()[WhackAMole.getX()][WhackAMole.getY()] == 'M'){
					WhackAMole.getGrid()[WhackAMole.getX()][WhackAMole.getY()] = 'W';
				}	
			}
		}

		//For every spot that has recorded a “whacked mole,” print out a W, or * otherwise.
		for(int i=0; i<WhackAMole.getGrid().length; i++) {
			for (int j = 0; j<WhackAMole.getGrid().length; j++) {
				if(WhackAMole.getGrid()[i][j] == 'W') {
					System.out.print(" "+WhackAMole.getGrid()[i][j]+" ");
				}		
				else {System.out.print(" * ");}				
			}	
			System.out.println();
		}
	}








}
