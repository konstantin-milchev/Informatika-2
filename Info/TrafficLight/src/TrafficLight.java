
public class TrafficLight {
	
	public TrafficLightState state;
	
	public TrafficLight(){
		
		
	}

	
	public void next(){
		
		state.next();
	}
	
	public void changeState(TrafficLightState s){
		
		this.state=s;
	}
}
