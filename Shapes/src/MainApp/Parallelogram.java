/*
 * Problem: Parallelogram Shape
 * Implements a Parallelogram shape class with base, side, and height for area
 * and perimeter calculations.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;

public class Parallelogram {
	 private double length ;
	 private double width ;
	 private double hight ;
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
	 //--------------------------------------------//
	 void set_hight ( double hight ) {
		 if ( hight < 0 ) hight =0;
			 this.hight = hight ;
		 }
	 //-----------------------------------------------//
	 public double get_length ( ) {
		 return length ;
		 }
	//-----------------------------------------------//
		 public double get_hight ( ) {
			 return hight ;
			 }
	 //----------------------------------------------//
     public double get_width ( ) {
		 return width ;
		 }
	 //----------------------------------------------//
	 public double area ( ) {
		 return hight*length ;
		 }
	 //----------------------------------------------//
	 public double primetre ( ) {
		 return 2*(width+length) ;
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

	  public Parallelogram ( double length , double width,double hight ) {
		 set_length ( length ) ;
		 set_width ( width ) ;
		 set_hight ( hight ) ;


}}
