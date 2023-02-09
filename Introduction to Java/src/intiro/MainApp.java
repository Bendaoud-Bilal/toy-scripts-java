/*
 * Problem: Geometry Main App
 * Entry point for the geometry calculator that demonstrates creating shape
 * objects and invoking their methods.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package intiro;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Geometry geo = new Geometry();
		System.out.println("the area of rectangle with length of 8 and width 4 is " + Geometry.getRectangleArea(8, 4));
		System.out.println("the area of circle with radius of 8 is " + Geometry.getCircleArea(6));
		System.out.println("the Circumferencce of rectangle with length of 8 and width 4 is "
				+ Geometry.getRectCircumferencce(8, 4));

	}

}
