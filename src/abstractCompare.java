/* Kim Merchant
This program is meant to override the compareTo method so that the natural order 
of shapes allows triangles, rectangles, and squares to be arranged in relation to their areas and the following rules:

	Triangle objects are:
		greater than any Shape objects whose area are less than theirs.
		equal to any Shape objects whose area are the same.
		less than any Shape objects whose area are greater than theirs. 
	Rectangle objects are:
		greater than any Shape objects whose area are greater than theirs.
		equal to any Shape objects whose area are the same.
		less than any Shape objects whose area are less than theirs. 
	Square objects are:
		equal to any Shape objects with the same area.
		greater than any other Shape objects otherwise.
	
No resources used except for notes	
Gilligan's Island rule applied
*/

public abstract class abstractCompare implements Shape {		// describes how this compare method will apply to Shape objects
	// compareTo method
	public int compareTo(Shape otherShape) {
		if (this.type() == 3) {									// if the "this" shape is a triangle:
			if (this.area() > otherShape.area()) {					// if the triangle area is greater than the area of the other shape
				return 1;												// the triangle is greater than the other shape;
			} else if (this.area() == otherShape.area()) {			// or if the area of the triangle is equal to the area of the other shape
				return 0;												// the two shapes are equal;
			} else if (this.area() < otherShape.area()) {			// but if the area of the triangle is less than the area of the other shape
				return -1;												// the other shape is greater.
			}
		}
		
		else if (this.type() == 1) {							// if the "this" shape is a rectangle:
			if (this.area() < otherShape.area()) {					// if the rectangle area is less than the area of the other shape
				return 1;												// the rectangle is greater than the other shape
			} else if (this.area() == otherShape.area()) {			// or if the rectangle area is equal to the area of the other shape
				return 0;												// the two shapes are equal;
			} else if (this.area() > otherShape.area()) {			// but if the rectangle area is greater than the area of the other shape
				return -1;												// the other shape is greater.
			}
		}
		
		else if (this.type() == 2) {							// if the "this" shape is a square:
			if (this.area() == otherShape.area()) {					// if the areas of the square and the other shape are equal 
				return 0;												// the two shapes are equal;
			} else {												// otherwise, 
				return 1;												// the square is greater than the other shape
			}
		}
	throw new RuntimeException("The shapes included are not all rectangles, squares, or triangles.");	// throws exception for 								//
	}																									// unrecognized shape	
	
}
