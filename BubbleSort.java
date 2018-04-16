package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = { 0, 1, 11, 3, 5, 4, 6, 8, 10 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	static void bubbleSort(int[] arraySort) {

		int counter = 0;
		boolean hasSwap = false;
		for (int i = 0; i < arraySort.length; i++) {
			for (int j = 0; j < arraySort.length - 1 - i; j++) {
				counter++;
				if (arraySort[j] > arraySort[j + 1]) {
					hasSwap = true;
					int temp = arraySort[j];
					arraySort[j] = arraySort[j + 1];
					arraySort[j + 1] = temp;
				}
			}

			if (!hasSwap) {
				break;
			}
			hasSwap = false;
		}

		System.out.println("operations : " + counter);

	}
}

