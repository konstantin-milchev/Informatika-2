/**
 * 
 */
package de.tum;

/**
 * @author damir
 *
 */
public class YellowState extends TrafficLightState {

	/**
	 * @param tl
	 */
	public YellowState(TrafficLight tl) {
		super(tl);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.tum.TrafficLightState#next()
	 */
	@Override
	public void next() {
		System.out.println("TrafficLight: Swithching from YELLOW to RED");
		super.light.changeState(new RedState(light));
	}

}
