/*
 * Problem: Car (Listener Copy)
 * Copy of the listener-pattern Car class used for comparison or backup during
 * development.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener.copy;

import java.util.Observer;
import java.util.Observable;

public abstract class  Car  {
	
	public String color;
	
	public String CarState;
	
	public Car(String color) {
		this.color=color;
	} 
	
	protected void accelerate () {
		System.out.println("the "+ this.color+" car is accelerating");
	}
	
	protected void stop() {
		System.out.println("the "+ this.color+" car is stopping");
	}
	
	
	// 1 is green color of traffic light
	// 0 is red color of traffic light

	
}
