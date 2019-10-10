
/****************************************************************
 * This is a simple example of polymorphism. There is an interface called shape that
 * contains an abstract method that is utilized by the classes; triangle, rectangle, and circle. 
 *   
 * The abstract method must calculate the area of each shape. 
 * We round the result of the calculation to the nearest integer value before returning it.
 * 
 * **************************************************************/
public class Test {

	public static void main(String[] args) {
		//Make an object for each class
		Rectangle r = new Rectangle(4,3);
		Triangle t = new Triangle(5,2);
		Circle c = new Circle(5);
		//Print results
		System.out.println(r.GetArea());
		System.out.println(t.GetArea());
		System.out.println(c.GetArea());
		// Find the total area for all shapes
		int result = r.GetArea() + t.GetArea() + c.GetArea();
		System.out.println(result);



	}

}
