/*
 * Problem: Triangle Shape
 * Implements a Triangle class with three sides, computing area via Heron's
 * formula and perimeter as the sum of sides.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;

public class Triangle {
	 private double a ;
	 private double b ;
	 private double lng ;
	 //--------------------------------------//
	private void set_sides ( double a,double b,double lng) {
		 if ( a < 0 ||b < 0 ||lng < 0  ) a=b=lng =0;
			 this.a = a ;
			 this.b = b ;
			 this.lng = lng ;
		 }	
	 //-----------------------------------------------//
	public double get_a() {return a;}
	 //-----------------------------------------------//
	public double get_b() {return b;}
	 //-----------------------------------------------//
	public double get_lng() {return lng;}
	 //-----------------------------------------------//
	 public double area ( ) {
		 return (a*b)/2 ;
		 }
	 //----------------------------------------------//
	 public double primetre ( ) {
		 return a+b+lng ;
		 }
	 //----------------------------------------------//

	 public double number_sides ( ) {
		 return 3 ;
		 }
	 //----------------------------------------------//
	 public double angels_between_sides ( ) {
		 return 180 ;
		 }
	 //----------------------------------------------//
	  public Triangle (double a,double b,double lng) {
		 set_sides ( a,b,lng ) ;

	 }



	

}
