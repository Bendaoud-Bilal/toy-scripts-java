/*
 * Problem: Rectangle Shape
 * Implements a Rectangle class extending Shape, computing area and perimeter
 * from width and height.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;

public class Rectangle {
	 private double length ;
	 private double width ;
	 //--------------------------------------//
	 void set_length ( double length ) {
		 if ( length < 0 ) length =0;
			 this.length = length ;
		 }
	 //--------------------------------------------//
	 void set_width ( double width ) {
		 if ( width < 0 ) width =0;
			 this.width = width ;
		 }
	 //-----------------------------------------------//
	 public double get_length ( ) {
		 return length ;
		 }
	 //----------------------------------------------//
     public double get_width ( ) {
		 return width ;
		 }
	 //----------------------------------------------//
	 public double area ( ) {
		 return width*length ;
		 }
	 //----------------------------------------------//
	 public double primetre ( ) {
		 return (2*width)+(2*length) ;
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

	  public Rectangle ( double length , double width ) {
		 set_length ( length ) ;
		 set_width ( width ) ;

	 }
}
