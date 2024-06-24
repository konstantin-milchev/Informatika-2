package de.tum;

public class RedState extends TrafficLightState {

	public RedState(TrafficLight tl) {
		super(tl);
	}

	/* (non-Javadoc)
	 * @see de.tum.TrafficLightState#next()
	 */
	@Override
	public void next() {
		System.out.println("TrafficLight: Swithching from RED to GREEN");
		super.light.changeState(new GreenState(light));
	}

}
