/*
 * Problem: Moving Car (Listener)
 * Moving car that listens for traffic light changes and stops on red using the
 * listener pattern.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener;

public class MovingCar extends Car implements OnTrafficLightChangeListerner{
	
	public MovingCar(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  void OnTrafficLightChange(int color) {
		
		if (color==1) 
			this.accelerate();
		else {
			this.stop();}
	}

}
