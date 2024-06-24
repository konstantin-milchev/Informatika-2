package de.tum;

public class Client {

	public static void main(String[] args) {

		File simpleFile = new File();
		

		InfoView view1 = new InfoView();
		ListView view2 = new ListView();
		
		
		simpleFile.subscribe(view1);
		simpleFile.subscribe(view2);
		
		
		System.out.println("Client: Changing Filename");
		simpleFile.setFilename("NEW NAME 1");
		System.out.println();
		
		System.out.println("Client: Changing Filename again");
		simpleFile.setFilename("NEW NAME 2");
	}

}
