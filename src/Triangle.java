/* Kim Merchant
This program is meant to create a triangle object with a base and height attributed to it, and the ability to access
both it's area, and shape type (triangle).
	
No resources used except for notes	
Gilligan's Island rule applied
*/
public class Triangle extends abstractCompare implements Shape {	// the triangle object is comparable via abstractCompare 
	// instance variables											// instead of the default compareTo
	private double base;							// the triangle object has an attributed "base" dimension
	private double height;							// the triangle object has an attributed "height" dimension
	
	public Triangle(double base, double height) {	// establishes that a triangle object is given a base and height upon creation
		this.base = base;
		this.height = height;
	}

	public double area() {							// allows calculation of the area of the triangle object
		return (0.5 * base * height);
	}
	
	public int type() {								// a number identifying the shape object as a triangle shape object
		return 3;
	}
}