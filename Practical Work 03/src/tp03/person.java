/*
 * Problem: Person Class (TP03)
 * Implements a Person class with attributes and methods, practicing class
 * design and constructor overloading.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package tp03;

public class person {
	private int age;
	private String name;
//----------------------------------------------------------
	public person(int age, String name) {
		setage(age);
		setname(name);
	}
//-------------------------------------------------------------------
	private void setname(String name) {
	     this.name=name;
		
//----------------------------------------------------------------------------
	private void setage(int age) {
		if(age<0)
			age=0;
		this.age=age;
	}
//----------------------------------------------------------------------------
	

}
