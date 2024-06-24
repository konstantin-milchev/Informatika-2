
public class GreenState extends TrafficLightState{

	public GreenState(TrafficLight light){
		
		super.light=light;
	}
	
	public void next(){
		
		System.out.print("Turning to Red");
		light.changeState(new YellowState(light));
	}
	
}
