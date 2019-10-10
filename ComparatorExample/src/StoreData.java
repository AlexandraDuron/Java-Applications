
/* 	This class reads the data of the students, and makes Student objects */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreData {
	//Attributes. 
	//Make an array to store the players.
	static ArrayList<Player> player = new ArrayList<>();

	//Read the .csv file.
	public void readFile() throws FileNotFoundException {

		String fileName = "players.csv";
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		//ignore the first line
		scanner.next();
		//Read file
		while(scanner.hasNext()) {
			//Store rows in a String "row".
			String row = scanner.next();
			//Break the string "row" and split into columns.
			String [] data = row.split(",");
			// make player objects
				player.add(new Player(data[0],Integer.valueOf(data[1])));
		}scanner.close();
	}
	//Get students array
	public static List<Player> getPayer() {

		return player;
	}
}
