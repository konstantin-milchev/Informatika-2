package edu.tum.cs.i1.mse2015;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	public void execute() {
		garageDoor.up();
	}
	public void undo() {
		garageDoor.down();
	}
}
