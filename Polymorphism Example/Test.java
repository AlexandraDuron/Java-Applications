import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {


		//Test Polymorphism for Professor class
		Professor p = new Professor("Rob","Lee");
		p.print();

		//Test Polymorphism for Professor class
		Student s = new Student("Sam", "Johnson", 2014, 9.1);
		s.print();

		//Make an array of people
		System.out.println("\nMake an ArrayList of people: ");
		ArrayList<Person> person = new ArrayList<Person>();		
		person.add(new Professor("Ron","Poet"));
		person.add(new Professor("Simon","Rogers"));
		person.add(new Professor("Gerardo","Camarasa"));
		person.add(new Student("Misa","Fernández",2018,9.6));
		person.add(new Student("Alexa","Durón",2018,9.6));
		person.add(new Student("Nick","Louis",2018,9.6));

		//Print the ArrayList
		for(Person temp:person) {
			temp.print();
		}

	}

}
