/* Kim Merchant
This program is meant to create a square object with a length attributed to it, and the ability to access
both it's area, and shape type (square).
	
No resources used except for notes	
Gilligan's Island rule applied
*/

public class Square extends abstractCompare implements Shape { 	// the square object is comparable via abstractCompare
	// instance variables										// instead of the default compareTo
	double length;						// the square object has a "length" dimension
	
	// constructor
	public Square(double length) {		// establishes that the square object is given a length dimension upon creation
		new Rectangle(length, length);	// defines a square object as a specific type of rectangle object
		this.length = length;
	}

	@Override
	public double area() {				// allows calculation of the area of the square object
		return (length * length);
	}
	
	public int type() {					// a number identifying the shape object as a square shape object
		return 2;
	}	
}
