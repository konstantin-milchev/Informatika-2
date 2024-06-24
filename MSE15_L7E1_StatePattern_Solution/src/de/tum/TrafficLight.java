package de.tum;

public class TrafficLight {

	/***
	 * This is the state for the Traffic light
	 */
	TrafficLightState state;
	
	public TrafficLight() {
		// When we initialize the TrafficLight  we start it with the RedState
		state = new RedState(this);
	}
	
	/***
	 * Changes the state in the TrafficLight
	 * @param s   the State parameter
	 */
	public void changeState(TrafficLightState s)
	{
		this.state = s;
	}

	/**
	 * Switches to the next light
	 */
	public void next()
	{
		this.state.next();
	}
}
