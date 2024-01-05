/*
 * Problem: Traffic Light (Listener)
 * Traffic light class that notifies registered listeners when its state
 * changes (observer pattern).
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener;
import java.util.List;

import TrafficLight.Car;

import java.util.ArrayList;

 

public class TrafficLight{
	
	public int color;
	
	
	List<OnTrafficLightChangeListerner>CarList=new ArrayList<OnTrafficLightChangeListerner>();
	
	
	public int ChangeTrafficLightColor(){
		if (this.color==1)
			this.color=0;
		else 
			this.color=1;
			
		for (OnTrafficLightChangeListerner car : CarList) {
			car.OnTrafficLightChange(this.color);
		}	
		return color;
	}


}
