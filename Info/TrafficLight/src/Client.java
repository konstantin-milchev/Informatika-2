
public class Client {
	
	public static void main(String[] args){
		
		TrafficLight light=new TrafficLight();
		RedState state=new RedState(light);
		light.state=state;
		light.next();
		light.next();
		light.next();
	}

}
