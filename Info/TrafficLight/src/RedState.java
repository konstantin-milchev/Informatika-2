
public class RedState extends TrafficLightState{

public RedState(TrafficLight light){
	
	super.light=light;
}

public void next(){
	
	System.out.print("Turning to Yellow");
	light.changeState(new GreenState(light));
}

}
