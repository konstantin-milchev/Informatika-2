package edu.tum.cs.i1.mse2015;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
 
	public RemoteControl() {
		onCommands = new Command[6];
		offCommands = new Command[6];
	}
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
