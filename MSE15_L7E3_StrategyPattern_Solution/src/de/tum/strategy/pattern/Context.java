package de.tum.strategy.pattern;

import de.tum.strategies.SortStrategy;

public class Context {

	private SortStrategy sortStrategy;
	private int[] elements;

	public void setSortAlgorithm(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void sort() {
		sortStrategy.performSort(this.elements);
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}

}
