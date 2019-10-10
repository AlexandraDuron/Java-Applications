
public class Rectangle implements Shape{

	//Attributes
	int height,width;

	//Constructor
	public Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}

	//Get area for rectangle
	@Override
	public int GetArea() {
		int area = height * width;
		return area;
	}

}
