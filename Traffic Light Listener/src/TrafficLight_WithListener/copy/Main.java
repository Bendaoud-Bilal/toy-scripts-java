/*
 * Problem: Main (Listener Copy)
 * Copy of the listener-pattern main class for reference.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener.copy;

import TrafficLight_WithListener.OnTrafficLightChangeListerner;
import TrafficLight_WithListener.copy.TrafficLight.State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight TL=new TrafficLight(State.GREEN);
		
	    MovingCar c1=new MovingCar("red");
	    StoppedCar c2=new StoppedCar("blue");
	    MovingCar c3=new MovingCar("white");
	    MovingCar c4=new MovingCar("grey");
	    

	    System.out.println("the cars states");
	    System.out.println("the state of c1 is "+c1.CarState);
	    System.out.println("the state of c2 is "+c2.CarState);
	    System.out.println("the state of c3 is "+c3.CarState);
	    System.out.println("the state of c4 is "+c4.CarState);
		
	    //TL.CarList.add(c2);
	     TL.CarList.add( (OnTrafficLightChangeListerner) c1);
	     
	     TL.CarList.add((OnTrafficLightChangeListerner) c3);
	     TL.CarList.add((OnTrafficLightChangeListerner) c4);
	     TL.ChangeTrafficLightColor();
	     
	     	System.out.println("the cars states");
		    System.out.println("the state of c1 is "+c1.CarState);
		    System.out.println("the state of c2 is "+c2.CarState);
		    System.out.println("the state of c3 is "+c3.CarState);
		    System.out.println("the state of c4 is "+c4.CarState);

	}

}
