
public class Circle implements Shape{

	//Attributes
	int radius;

	//Constructor
	public Circle(int radius) {
		this.radius = radius;
	}

	//Get area for circle
	@Override
	public int GetArea() {
		double area = Math.round((3.14*radius*radius));
		int a = (int)area;
		return a;
	}	
}

