/*
 * Problem: Listener Interface (Copy)
 * Copy of the listener interface for traffic light changes.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener.copy;
import java.util.List;
import java.util.ArrayList;
import TrafficLight.Car;
import TrafficLight_WithListener.copy.OnTrafficLightChangeListerner;
import TrafficLight_WithListener.copy.TrafficLight.State;

import java.util.ArrayList;

public interface OnTrafficLightChangeListerner {

	
	 void OnTrafficLightChange(State state);
}
