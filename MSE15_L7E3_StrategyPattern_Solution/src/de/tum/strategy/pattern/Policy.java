package de.tum.strategy.pattern;

import de.tum.strategies.MergeSort;
import de.tum.strategies.QuickSort;

public class Policy {
	
	private boolean timeImportant;
	private boolean spaceImportant;
	
	// This policy here knows the context
	private Context arraySorter;
	
	public Policy (Context theSorter){
		this.arraySorter = theSorter;
		timeImportant = true;
		spaceImportant = false;
	}
	
	public boolean isTimeImportant() {
		return this.timeImportant;
	}
	
	public boolean isSpaceImportant() {
		return this.spaceImportant;
	}
	
	private void setTimeImportant(boolean timeImportant) {
		this.timeImportant = timeImportant;
	}
	

	private void setSpaceImportant(boolean spaceImportant) {
		this.spaceImportant = spaceImportant;
	}
	
	public void configure(boolean timeIsImportant, boolean spaceIsImportant){
		this.setTimeImportant(timeIsImportant);
		this.setSpaceImportant(spaceIsImportant);
		
		if (isTimeImportant() && !isSpaceImportant()) {
			System.out.println("Time is important, choosing merge sort!");
			this.arraySorter.setSortAlgorithm(new MergeSort());
		} else if (isTimeImportant() && isSpaceImportant()) {
			System.out.println("Time and space are important, choosing quick sort!");
			this.arraySorter.setSortAlgorithm(new QuickSort());
		}
	}
}
