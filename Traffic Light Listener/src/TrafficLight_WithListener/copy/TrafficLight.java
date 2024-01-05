/*
 * Problem: Traffic Light (Listener Copy)
 * Copy of the listener-pattern TrafficLight class.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener.copy;
import java.util.List;

import TrafficLight.Car;
import TrafficLight_WithListener.OnTrafficLightChangeListerner;

import java.util.ArrayList;

 

public class TrafficLight{
	public enum State{
		RED,YELLOW,GREEN
	}
	
	private State currentState;
	
	public TrafficLight(State st) {
		// TODO Auto-generated constructor stub
		this.currentState=st;
	}

	public void setState(State state) {
		this.currentState = state;
	}
	public State getState() {
		return this.currentState;
	}
	
	
ArrayList<OnTrafficLightChangeListerner>CarList=new ArrayList<OnTrafficLightChangeListerner>();
	
	
	public void ChangeTrafficLightColor(){
		if (this.currentState==State.GREEN)
			this.currentState=State.RED;
		else 
			this.currentState=State.GREEN;
			
		for (OnTrafficLightChangeListerner car : CarList) {
			car.OnTrafficLightChange(this.currentState);
		}	
		
	}



}
