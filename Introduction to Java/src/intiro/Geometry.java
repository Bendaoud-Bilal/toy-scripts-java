/*
 * Problem: Geometry Calculator
 * Implements geometric calculations (area, perimeter) for basic shapes using
 * Java methods and classes.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package intiro;

public final class Geometry {
	private Geometry() {
	}

	public static int getRectangleArea(int length, int width) {
		// TODO Auto-generated method stub
		return length * width;
	}

	public static double getCircleArea(int radius) {
		// TODO Auto-generated method stub
		radius /= 2;
		return radius * radius * 3.14;

	}

	public static int getRectCircumferencce(int length, int width) {
		// TODO Auto-generated method stub
		return (2 * length) + (2 * width);
	}

}
