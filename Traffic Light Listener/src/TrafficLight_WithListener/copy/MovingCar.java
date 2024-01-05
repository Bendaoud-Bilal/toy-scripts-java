/*
 * Problem: Moving Car (Listener Copy)
 * Copy of the listener-pattern MovingCar class.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener.copy;

import TrafficLight_WithListener.copy.TrafficLight.State;

public class MovingCar extends Car implements OnTrafficLightChangeListerner{
	
	public String CarState;
	
	public MovingCar(String color) {
		super(color);
		// TODO Auto-generated constructor stub
		this.CarState="moving";
	}

	public  void OnTrafficLightChange(State state) {
		
		if (state== State.GREEN) {
			this.accelerate();
			this.CarState="moving";}
		else {
			this.stop();
			this.CarState="stopped";}
	}

}
