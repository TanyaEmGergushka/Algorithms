package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { -100,0, 109, 7, 12, 14, 8, 3, 2, -5 };
		
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

	static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivotdx = partition(arr, left, right);
		quickSort(arr, left, pivotdx - 1);
		quickSort(arr, pivotdx + 1, right);

	}

	static int partition(int[] masiv, int left, int right) {

		int pivot = masiv[right]; // 1. choose pivot
		int idx = left;

		for (int i = left; i < right; i++) { // 2. traverse all element and compare with pivot
						
			if (masiv[i] < pivot) { // 3. if lesser than pivot - move to the beginning
									
				swap(masiv, i, idx++);
			}
		}

		swap(masiv, right, idx); // 4. at last - move pivot after all lesser values
		return idx;
	}

	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
