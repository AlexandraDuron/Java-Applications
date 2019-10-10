import java.util.Comparator;

public class Checker implements Comparator<Player>{
	//Sort scores
	public int compare(Player a, Player b) {
		//Sort by scores in descending order.
		if(a.score<b.score){
			return 1;
		}
		//Sort by name if the two players have the same score.
		else if(a.score==b.score){
			return a.name.compareTo(b.name);
		}
		else{
			return -1;
		}
	}
}
