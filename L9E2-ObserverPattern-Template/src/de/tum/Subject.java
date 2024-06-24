package de.tum;

import java.util.ArrayList;

public abstract class Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void subscribe(Observer o) {
		observers.add(o);
		o.setSubject(this);
	}

	public void unsubscribe(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}
