/*
 * Problem: Car (Basic Traffic)
 * Car class that reacts to traffic light state changes in the basic (non-
 * listener) implementation.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight;

import TrafficLight_WithListener.copy.TrafficLight.State;

public abstract class  Car {
	
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
	
	public abstract void OnTrafficLightChange(State currentState);
	
	// 1 is green color of traffic light
	// 0 is red color of traffic light

	
}
