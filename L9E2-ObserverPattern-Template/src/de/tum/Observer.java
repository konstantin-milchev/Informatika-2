package de.tum;

public abstract class Observer {
	private Subject observedSubject;

	public abstract void update();

	public void setSubject(Subject suj) {
		observedSubject = suj;
	}
}
