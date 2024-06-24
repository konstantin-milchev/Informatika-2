package de.tum;

public class File extends Subject {

	private String name;

	public void setFilename(String newName) {
		name = newName;
		notifyObservers();
	}

	public String getFilename() {
		return name;
	}

}
