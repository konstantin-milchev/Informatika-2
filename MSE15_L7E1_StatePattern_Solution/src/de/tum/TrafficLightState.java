package de.tum;

public abstract class TrafficLightState {

	protected TrafficLight light;
	
	/***
	 * This is the only constructor for TrafficLightState which enforces to set the TrafficLight as paramater on initialisation
	 * @param m
	 */
	public TrafficLightState(TrafficLight tl) {
		this.light = tl;
	}
	
	public abstract void next();
	
}
