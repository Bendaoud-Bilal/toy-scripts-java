/*
 * Problem: Car (Listener Pattern)
 * Car class implementing the traffic light change listener interface for
 * event-driven state updates.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener;

import java.util.Observer;
import java.util.Observable;

public abstract class  Car{
	
	public String color;
	
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
