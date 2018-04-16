package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {7,1,6,2,4};
		selectionSort(array);
		System.out.println(Arrays.toString(array));

	}

	static void selectionSort(int[] sortArray) {
		

		for (int j = 0; j < sortArray.length/2; j++) {           // the loop will stop on sortArray.length/2, 
									//	because on each iteration we have sorted 2 elements of the array
			
			int min = sortArray[j]; // take current  element as min
			int max = sortArray[j]; // take current  element as max
			int minIndex = j; // take current index as index of min element
			int maxIndex = j; // take current index as index of max element
			
			for (int i = j+1; i < sortArray.length-j; i++) {
				// the loop starts from j+1 to avoid compare of current element with itself
				// the loop will stop to length-j to avoid compare of already sorted elements 
				
				if (min > sortArray[i]) {    // compare current element with min, and swap it, if needed.
					min = sortArray[i];
					minIndex = i;			// save index of min element
				}
				if (max < sortArray [i]){  // compare current element with max, and swap it, if needed.
					max = sortArray [i];
					maxIndex = i;			// save index of max element
				}
				
			}
			// swap current element with min element
			int temp = sortArray[minIndex];
			sortArray[minIndex] = sortArray[j];
			sortArray[j] = temp;
			
			//!!! check if current index is equals to max index, because we already have moved current element on different index / old index of min element
			if (maxIndex==j){
				maxIndex = minIndex;
			}
			// swap max element with the current last element of unsorted part of the array
			
			temp = sortArray [maxIndex];
			sortArray [maxIndex] = sortArray [sortArray.length-1-j];
			sortArray[sortArray.length-1-j] = temp;
		}

	}
}