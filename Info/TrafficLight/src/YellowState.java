
public class YellowState extends TrafficLightState{
	
public YellowState(TrafficLight light){
		
		super.light=light;
	}
	
	public void next(){
		
		System.out.print("Turning to Yellow");
		
	}

}
