
/****************************************************************
 * This is an example to show how Polymorphism works.
 *  
 * We make a parent class called Person. Then, we make professors and student objects. 
 * The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a 
 * parent class is used to invoke the method, then the version in the parent class will be executed,
 * but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. 
 * **************************************************************/

public class Person {

	//Attributes
	private String firstName,lastName;

	public Person (String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;		
	}

	//Nice display
	public void print() {

		System.out.println("My name is: " + firstName + " "+ lastName);


	}

}
