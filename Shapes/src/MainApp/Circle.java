/*
 * Problem: Circle Shape
 * Implements a Circle class extending a Shape base class, computing area and
 * perimeter using the radius.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;
import java.math .*;
class Circle {
	 private double radius;
	 //---------------------------------------------//
	 public void setradius ( double r ) {
		 if ( r < 0 ) r = 0 ;
		 this.radius = r ;
		 }
	 //-----------------------------------------------//
     public double getradius ( ) {
			 return radius ;
			 }
     //------------------------------------------------//
	 public double number_sides ( ) {
		 return 1 ;
		 }
	 //----------------------------------------------//
	 public double angels_between_sides ( ) {
		 return 0 ;
		 }
	 //----------------------------------------------//
	 public double primetre ( ) {
		 return 2*radius* Math.PI ;
		 }
	 //----------------------------------------------//
		public double area () {
			return radius*radius* Math.PI ;
		}
	 //----------------------------------------------//
	 public Circle ( double radius ) {
				setradius ( radius ) ;
				}

			 }

