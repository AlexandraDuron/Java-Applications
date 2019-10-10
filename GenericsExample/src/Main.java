import java.lang.reflect.Method;

public class Main {
	// Test
	public static void main( String args[] ) {
		
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = {"Hello", "World"};
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);

	}

}
