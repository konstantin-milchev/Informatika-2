/**
 * 
 */
package de.tum;

/**
 * @author damir
 *
 */
public class GreenState extends TrafficLightState {

	public GreenState(TrafficLight tl) {
		super(tl);
	}

	/* (non-Javadoc)
	 * @see de.tum.TrafficLightState#next()
	 */
	@Override
	public void next() {
		System.out.println("TrafficLight: Swithching from GREEN to YELLOW");
		super.light.changeState(new YellowState(light));
	}

}
