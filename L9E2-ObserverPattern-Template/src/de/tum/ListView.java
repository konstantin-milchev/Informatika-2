package de.tum;

public class ListView extends Observer {

	private String name;

	@Override
	public void update() {
		name = ((File) observedObject).getFilename();
	}
}
