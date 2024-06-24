package de.tum;

public class ListView extends Observer {


	public void update() {
		String newFileName = ((File)observedSubject).getFilename();
		System.out.println("LISTVIEW received an update for the file: "+ newFileName);
	}

}
