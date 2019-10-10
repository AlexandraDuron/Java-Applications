
/***********************************************************************
This class builts the system for the carpenter. 

The output of the the program is one of the following:

- An integer representing the cabinet the last item (as specified by the last line of input) was taken from, 
ranging from 1 (nearest) to N (furthest).

- 'NEW' if the item was newly created.

- 'OUTSIDE' if the item was outside.

- 'INPUT_ERROR' if the input was somehow incorrect.

Source: www.hackerrank.com		  
 ***********************************************************************/


import java.util.*;


public class Solution {

	//Attributes	
	ArrayList<Cabinet> store = new ArrayList<Cabinet>();
	//Make an array to store the size of each cabinet
	ArrayList<Integer> sizeOfCabinets = new ArrayList<Integer>();
	ArrayList<Integer> items = new ArrayList<Integer>();
	private int totalOfitems;
	static Scanner scanner;


	//Method to make cabinets
	public void makeCabinets(){

		String readCabinets = scanner.nextLine();
		String [] numberOfCabinets = readCabinets.split("\\s");

		try {
			totalOfitems = scanner.nextInt();
			if(totalOfitems<=0) {
				System.out.println("INPUT_ERROR");
				System.exit(0);
			}

		}catch(Exception exception){			
			System.out.println("INPUT_ERROR");
			//I would normally ask the user for type a correct input
			//But just for this test purposes, I chose to exit the program.
			System.exit(0);
		}

		try {
			for(String temp:numberOfCabinets){
				int size = Integer.parseInt(temp);
				store.add(new Cabinet());
				//check for a valid size for the cabinet(no negative numbers)
				if(size>0) {
					sizeOfCabinets.add(size);
				}
				else {
					System.out.println("INPUT_ERROR");
					System.exit(0); 
				}
			}	
		}catch(NumberFormatException exception){			
			System.out.println("INPUT_ERROR");
			//I would normally ask the user for type a correct input
			//But just for this test purposes, I chose to exit the program.
			System.exit(0); 
		}
	}

	//Method to put the items in the cabinets
	public void populateCabinets(){
		//Check for correct input, populate "items" array.
		try {
			while(scanner.hasNext()){
				items.add(Integer.parseInt(scanner.next()));
			}
		}catch(NumberFormatException exception) {
			System.out.println("INPUT_ERROR");
		}

		//Check for valid amount of items (k<2^31 ,the maximum value that java allows for an int type)
		if((items.size()-1)>2147483647) {
			System.out.println("INPUT_ERROR");	
		}

		//Check for negative items
		for(int i=0; i<items.size(); i++) {
			if(items.get(i)<=0) {
				System.out.println("INPUT_ERROR");
				System.exit(0); 
			}
		}

		//If there are only positive items, put them in the cabinets
		int moveInItems = items.size()-2;
		int count = 0;
		int i = 0;
		while(i<sizeOfCabinets.size()) {
			for(int j=0; j<sizeOfCabinets.get(i); j++){	
				if(moveInItems==0) {
					store.get(count).cabinet.put(items.get(moveInItems),1);
					break;
				}
				store.get(count).cabinet.put(items.get(moveInItems),1);
				moveInItems--;				
			}count++;
			i++;
		}	

		//Print the store with the cabinets
		System.out.println("This is the store with the cabinets");
		for(Cabinet temp:store) {
			System.out.println(temp.cabinet);
		}


	}

	//Look for the last element
	void lookForItem() {

		boolean newItem = true;
		//Check for available space
		int totalSpace = 0;
		for(int i = 0; i<sizeOfCabinets.size(); i++){
			totalSpace = totalSpace + sizeOfCabinets.get(i);
		}

		//Check in which cabinet the item is
		for(int i = 0; i<store.size(); i++){
			if(store.get(i).cabinet.containsKey(items.get(items.size()-1)) && totalSpace>=items.size()-1){
				System.out.println(i+1);
				newItem = false;
				break;
			}	

			else if(store.get(i).cabinet.containsKey(items.get(items.size()-1)) && totalSpace<items.size()-1){
				System.out.println(i);
				newItem = false;
				break;
			}
		}

		//Check if item is outside	
		for(int i=0; i<items.size()-1-totalSpace; i++) {
			if(items.get(i)==items.get(items.size()-1)){
				System.out.println("OUTSIDE");
				System.exit(0); 

			}		
		}

		//Check if item is new
		if(newItem) {
			System.out.println("NEW");
		}
	}







}