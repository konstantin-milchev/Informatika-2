package de.tum;

public class Client {

	public static void main(String[] args) {

		// We start with red
		System.out.println("Client: Starting with Red:");
		TrafficLight aTrafficLight = new TrafficLight();
		
		aTrafficLight.next();
		System.out.println("Client: now it should be green:");
		aTrafficLight.next();
		System.out.println("Client: now it should be yellow:");
		aTrafficLight.next();
		System.out.println("Client: now it should be red again:");
		aTrafficLight.next();
		System.out.println("Client: now it should be green:");
		aTrafficLight.next();
		System.out.println("Client: now it should be yellow:");
		aTrafficLight.next();
		System.out.println("Client: now it should be red again:");
		aTrafficLight.next();
		System.out.println("Client: now it should be green:");
		aTrafficLight.next();
		System.out.println("Client: now it should be yellow:");
		aTrafficLight.next();
		System.out.println("Client: now it should be red again:");
		aTrafficLight.next();
		System.out.println("Client: now it should be green:");
		aTrafficLight.next();
		System.out.println("Client: now it should be yellow:");
		aTrafficLight.next();
		System.out.println("Client: now it should be red again:");


	}

}
