/*
 * Problem: Square Shape
 * Implements a Square class as a special case of Rectangle, with a single side
 * length parameter.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;

public class Square {
	 private double side ;
	 //--------------------------------------//
	private void set_side ( double side ) {
		 if ( side < 0 ) side =0;
			 this.side = side ;
		 }	
	 //-----------------------------------------------//
	public double get_side() {
		return side;
	}
	 //-----------------------------------------------//
	 public double area ( ) {
		 return side*side ;
		 }
	 //----------------------------------------------//
	 public double primetre ( ) {
		 return 4*side ;
		 }
	 //----------------------------------------------//

	 public double number_sides ( ) {
		 return 4 ;
		 }
	 //----------------------------------------------//
	 public double angels_between_sides ( ) {
		 return 90 ;
		 }
	 //----------------------------------------------//
	  public Square ( double side) {
		 set_side ( side ) ;

	 }

}
