/*
 * Problem: Traffic Light (Basic)
 * Traffic light class with state cycling (red, yellow, green) in the basic
 * implementation.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight;
import java.util.List;
import java.util.ArrayList;


public class TrafficLight {
	
	public int color;
	
	List<Car>CarList=new ArrayList<Car>();
	
	
	
	public int ChangeTrafficLightColor(){
		if (this.color==1)
			this.color=0;
		else 
			this.color=1;
			
		for (Car car : CarList) {
				car.OnTrafficLightChange(this.color);
			}	
		return color;
	}


}
