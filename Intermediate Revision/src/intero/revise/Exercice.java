/*
 * Problem: Intermediate Revision Exercises
 * Revision exercises covering intermediate Java OOP concepts: classes,
 * methods, constructors, and object interactions.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package intero.revise;


abstract class A {
protected int a;
protected int b;
protected String c;
/*public A(int a, int b, String c) {
	this.a = a;
 this.b = b;
 this.c = c;
}*/
public abstract void decrisToi();
}
class B extends A {
private String d;
public B(int a, int b, String c, String d) { this.a = a;
this.b = b;
this.c = c;
this.d = d;
}

}
public class Exercice {
public static void main(String[] args) { B b = new B(1, 2, "trois", "quatre"); 
b.decrisToi(); // 1, 2, trois, quatre
}
}