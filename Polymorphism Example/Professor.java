
public class Professor extends Person{

	//Constructor
	public Professor(String firstName, String lastName){
		//Calling the superclass constructor
		super(firstName,lastName ); 
	}

	@Override   // Overriding the behavior of the parent class. 
	public void print() {
		System.out.println("\nProfessor Details");
		super.print();
	}


}
