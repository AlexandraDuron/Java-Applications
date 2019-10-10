import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
	//A method that prints any type of array
	public <T> void printArray(T[] array){
		for(T temp: array){
			System.out.println(temp);
		}
	} 
}


