package de.tum.strategy.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortClient {

	private static int[] createIntegerArray() {
		Random random = new Random();
		int a[] = new int[30];
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.abs(random.nextInt() % 100);
		}
		return a;
	}

	private static int[] scrambleArray(int[] array) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for (int index = 0; index < array.length; index++) {
			tempList.add(array[index]);
		}

		Collections.shuffle(tempList);

		// Conversion back
		for (int i = 0; i < tempList.size(); i++) {
			array[i] = (Integer) tempList.get(i);
		}

		return array;
	}

	private static void printIntegerArray(int[] a) {
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1)
				System.out.print(",");
		}
		System.out.println("}");
	}

	private static void simulateRuntimeConfigurationChange(Policy sortPolicy) {
		Random randomGenerator = new Random();

		if ((randomGenerator.nextInt() % 2) == 0) {
			System.out.println("Time is important!");
			sortPolicy.configure(true, false);
		} else {
			System.out.println("Time and space are important!");
			sortPolicy.configure(true, true);
		}
	}

	public static void main(String[] args) {
		Context sortingContext = new Context();
		Policy policy = new Policy(sortingContext);

		int[] array = createIntegerArray();

		// test switching between the sort algorithms at runtime
		for (int i = 0; i < 10; i++) {
			array = scrambleArray(array);
			sortingContext.setElements(array);
			simulateRuntimeConfigurationChange(policy);
			System.out.print("Unsorted Array a = ");
			printIntegerArray(array);
			sortingContext.sort();
			System.out.print("Sorted Array a = ");
			printIntegerArray(array);
		}
	}

}
