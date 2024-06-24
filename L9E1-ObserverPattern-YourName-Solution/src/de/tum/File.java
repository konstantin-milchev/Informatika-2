package de.tum;

public class File extends Subject {

	private String filename = "";

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		notifyObservers();
	}

	
}
