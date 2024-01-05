/*
 * Problem: Traffic Light Main (Listener)
 * Entry point for the listener-based traffic light simulation demonstrating
 * the observer pattern.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight TL=new TrafficLight();
		
	    MovingCar c1=new MovingCar("red");
	    
	    StoppedCar c2=new StoppedCar("blue");
	    
	    TL.CarList.add(c1);
	    //TL.CarList.add(c2);
	    
	    TL.ChangeTrafficLightColor();

	}

}
