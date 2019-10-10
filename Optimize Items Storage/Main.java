
/***********************************************************************
A carpenter is working on items at his workbench. The carpenter works on a lot of different items one after
another, but unfortunately the bench only has space to hold one item at a time. So, once the carpenter
completes work on a particular item, he stores it in a cabinet. 

Then, he either goes back to his bench to create another item, or he continues working on one of the existing, previously stored,
items. He has a number of cabinets in his shop to store these items in.

It takes several iterations for the carpenter to finalize an item. When he continues work on a previously
created item, he takes it out of the correct cabinet, takes it back to the bench, works on the item, and then
stores it in a cabinet again. Then he takes out the next item, takes it back to the bench, etc, etc. He does
this many times a day.

It is very likely that the carpenter will be re-using an item he worked on recently. Because of this, he wants
to store the most recently used items in the cabinet closest to the bench, and the least recently used items
in the cabinet furthest away.

Each of these cabinets is limited in size, meaning; each cabinet can only store a limited number of items.
Each item is the same size (1), and identified with a 'numerical key' (integer) for administrative purposes.
When a cabinet is full, the item used least recently from that cabinet is moved to the next (further away)
cabinet. If all cabinets are full, the oldest item is stored outside of the shop, where there is infinite amount of
space.

In this task, we have to help the carpenter optimize storage of these items as described above by modelling this process in
code.

Input
First line: specification of the sizes of the cabinets (in order of nearest to furthest away) represented
as an array of space-separated integers (e.g. "2 5 4 3"). Number of integers == number of cabinets
(N).
Second line: number of lines (K) of input to follow.
Next K lines:
numerical key (integer) of the next item to be worked on by the carpenter



Source: www.hackerrank.com		  
 ***********************************************************************/


import java.io.File;
import java.util.Scanner;

public class Main {

	//Test section
	public static void main(String args[]) throws Exception {

		//Read File
		String fileName = "data.txt";
		File file = new File(fileName);
		Solution.scanner = new Scanner(file);

		//Make cabinets
		Solution solution = new Solution();
		solution.makeCabinets();
		//		long start = System.nanoTime();    
		solution.populateCabinets();
		//		long elapsedTime = System.nanoTime() - start;
		//		System.out.println(elapsedTime);
		solution.lookForItem();

	}

}
