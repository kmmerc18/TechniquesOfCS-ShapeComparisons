import java.util.ArrayList;
import java.util.Collections;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Rectangle(5.0, 10.0)); 	// area is 50.0
		shapes.add(new Rectangle(7.0, 5.0)); 	// area is 35.0
		shapes.add(new Square(3.0)); 			// area is 9.0
		shapes.add(new Square(9.0)); 			// area is 81.0
		shapes.add(new Triangle(10.0, 5.0)); 	// area is 25.0
		shapes.add(new Triangle(5.0, 15.0)); 	// area is 37.5
		Collections.sort(shapes); 				// sort all the shapes by their natural ordering

		for (Shape shape: shapes) {
			System.out.println(shape.area());
		}
		// expect 50.0, 35.0, 9.0, 25.0, 37.5, 81.0
	}
}