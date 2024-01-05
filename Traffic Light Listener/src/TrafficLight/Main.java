/*
 * Problem: Traffic Light Main (Basic)
 * Entry point for the basic traffic light simulation without the listener
 * pattern.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight TL=new TrafficLight();
		
	    MovingCar c1=new MovingCar("red");
	    
	    StoppedCar c2=new StoppedCar("blue");
	    
	    TL.CarList.add(c1);
	    TL.CarList.add(c2);
	    
	    TL.ChangeTrafficLightColor();

	}

}
