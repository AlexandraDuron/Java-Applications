import java.util.Arrays;
import java.util.Random;

public class WhackAMole {

	//Attributes
	private int gridDimension;
	private static char moleGrid[][];
	private static int x,y;

	//Constructor.   
	//It specifies the grid dimension.
	WhackAMole(int gridDimension) {

		this.moleGrid=new char[gridDimension][gridDimension];

	}

	//Given a location, take a whack at that location. 
	void whack(int x, int y) {
		this.x=x;
		this.y=y;

		//Check if there is a whack
		if(moleGrid[x][y] == 'M') {
			System.out.println("\nYou have found a Mole !!");		
		}
		else {
			System.out.println("\nPlease try again !!");
		}
	}

	//Getter method for grid
	static char [][]  getGrid() {	
		return moleGrid;
	}

	//Getters for coordinates
	static int getX() {	
		return x;
	}

	static int getY() {	
		return y;
	}


}





