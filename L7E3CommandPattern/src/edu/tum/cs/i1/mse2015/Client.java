package edu.tum.cs.i1.mse2015;

public class Client {
	public static void main(String args[]) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageDoorUp, garageDoorDown);
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.undoButtonWasPushed();
	}
}
