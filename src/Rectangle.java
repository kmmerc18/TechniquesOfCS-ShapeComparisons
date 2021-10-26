/* Kim Merchant
This program is meant to create a rectangle object with a height and width attributed to it, and the ability to access
both it's area, and shape type (rectangle).
	
No resources used except for notes	
Gilligan's Island rule applied
*/

public class Rectangle extends abstractCompare implements Shape {	// the rectangle object is comparable via abstractCompare
	// instance variables											// instead of the default compareTo
	protected double height;						// the rectangle object has a "height" dimension
	protected double width;							// the rectangle object has a "width" dimension
	
	//constructor
	public Rectangle(double height, double width) { // establishes a rectangle object has an associated height and width
		this.height = height;						// dimension upon creation
		this.width = width;
	}
	
	public double area() {							// allows calculation of the area of the rectangle object
		return height * width;
	}
	
	public int type() {								// a number identifying the shape object as a rectangle shape object
		return 1;
	}
}