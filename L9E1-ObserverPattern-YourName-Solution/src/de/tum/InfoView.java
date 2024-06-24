package de.tum;

public class InfoView extends Observer {


	public void update() {
		String newFileName = ((File)observedSubject).getFilename();
		System.out.println("INFOVIEW received an update for the file: "+ newFileName);
	}

}
