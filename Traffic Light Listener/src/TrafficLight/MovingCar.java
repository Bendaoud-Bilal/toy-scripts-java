/*
 * Problem: Moving Car (Basic)
 * A car subclass representing a moving car that must stop when the light turns
 * red.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight;

public class MovingCar extends Car{
	
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
