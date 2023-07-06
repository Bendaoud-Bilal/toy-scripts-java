/*
 * Problem: Shapes Main App
 * Entry point demonstrating polymorphism by creating various shape objects and
 * calling their area/perimeter methods.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package MainApp;
import java.util.Scanner ;
public class MainApp {
	 public static void main ( String [ ] args ) {
		 //---------------Rectangle---------------//
		 System.out.println ( "the rectangle width is 5 " ) ;
		 Rectangle rect = new Rectangle ( 10,5 ) ;
		 System.out.println ( " length is " + rect.get_length ( ) ) ;
		 System.out.println ( " width is " + rect.get_width ( ) ) ;
		 System.out.println ( " the primetre is " + rect.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + rect.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + rect.angels_between_sides ( ) ) ;
		 System.out.println ( " the surface is " + rect.area ( ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
		 
		 
		 //------------------Circle-------------------------//
		 System.out.println ( "radius of the circle is 4" ) ;		
		 Circle c = new Circle (  4  ) ;
		 System.out.println ( " radius is " + c.getradius ( ) ) ;
		 System.out.println ( " the primetre is " + c.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + c.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + c.angels_between_sides ( ) ) ;
		 System.out.println ( " area is " + c.area (  ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
		 
		 
		 //-----------------Square------------------------//
		 Square sqr = new Square ( 10) ;
		 System.out.println ( " the side long is " + sqr.get_side ( ) ) ;
		 System.out.println ( " the primetre is " + sqr.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + sqr.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + sqr.angels_between_sides ( ) ) ;
		 System.out.println ( " the surface is " + sqr.area ( ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
		 
		 
		 
		 //-----------------Triangle------------------------//
		 Triangle trngl = new Triangle ( 2,4,5) ;
		 System.out.println ( " the 1st side length is " + trngl.get_a() ) ;
		 System.out.println ( " the 2nd side length is " + trngl.get_b() ) ;
		 System.out.println ( " the 3rd side length is " + trngl.get_lng() ) ;
		 System.out.println ( " the primetre is " + trngl.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + trngl.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + trngl.angels_between_sides( ) ) ;
		 System.out.println ( " the surface is " + trngl.area ( ) ) ;
		 System.out.println ( " the primetre is " + trngl.primetre ( ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
		 
		 //-----------------Diamond------------------------//
		 Diamond dmnd = new Diamond ( 10) ;
		 System.out.println ( " the side long is " + dmnd.get_side ( ) ) ;
		 System.out.println ( " the primetre is " + dmnd.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + dmnd.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + dmnd.angels_between_sides ( ) ) ;
		 System.out.println ( " the surface is " + dmnd.area ( ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
		 
		 
		 //---------------Parallelogram---------------//
		 System.out.println ( "the Parallelogram width is 5 " ) ;
		 Parallelogram prlgrm = new Parallelogram ( 10,5 ,4) ;
		 System.out.println ( " length is " + prlgrm.get_length ( ) ) ;
		 System.out.println ( " width is " + prlgrm.get_width ( ) ) ;
		 System.out.println ( " hight is " + prlgrm.get_hight ( ) ) ;
		 System.out.println ( " the primetre is " + prlgrm.primetre ( ) ) ;
		 System.out.println ( " the number of sides is " + prlgrm.number_sides ( ) ) ;
		 System.out.println ( " angels between sides are " + prlgrm.angels_between_sides ( ) ) ;
		 System.out.println ( " the surface is " + prlgrm.area ( ) ) ;
		 System.out.println ( " !!!!!!!!!!------!!!!!!!!11! " ) ;
	 }
}
