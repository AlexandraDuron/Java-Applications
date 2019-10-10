/* 	This class makes a player */

public class Player {
	//Attributes
	String name;
	int score;
	//Constructor
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	//Nice display
	@Override
	public String toString() {
		String message = "Name: " + name + " Score: " + score;
		return message;
	}

}
