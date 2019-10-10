public class Triangle implements Shape{
	//Attributes
	int height,width;

	//Constructor
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	//Get area for triangle
	@Override
	public int GetArea() {
		double area = Math.round((height * width)/2);
		int a =(int)area;
		return a;
	}	
}