/*
 * Problem: Diamond Shape
 * Implements a Diamond (rhombus) shape class with area computation from its
 * diagonals.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;

public class Diamond {
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
	  public Diamond ( double side) {
		 set_side ( side ) ;

	 }

}
