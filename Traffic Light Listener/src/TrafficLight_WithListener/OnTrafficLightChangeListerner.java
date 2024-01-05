/*
 * Problem: Traffic Light Change Listener Interface
 * Listener interface defining the callback method for traffic light state
 * changes (observer pattern).
 * Context: University tutorial / lab exercise (TD / TP)
 */
package TrafficLight_WithListener;

import TrafficLight_WithListener.copy.TrafficLight.State;

public interface OnTrafficLightChangeListerner {


	 void OnTrafficLightChange(State currentState);
}
