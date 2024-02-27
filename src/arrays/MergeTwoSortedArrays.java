package arrays;

public class MergeTwoSortedArrays {

	/*
	 * 
	 * Given two sorted arrays A and B, find the merged sorted array C by merging A
	 * and B.
	 * 
	 * Example: A: [1, 2, 3, 4, 4] B: [2, 4, 5, 5] C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
	 */
	private static int[] mergeSortedArrays(int[] A, int[] B) {
		// add your logic here
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[A.length + B.length];

		while (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				result[k] = A[i];
				i++;
			} else {
				result[k] = B[j];
				j++;
			}
			k++;
		}

		while (i < A.length) {
			result[k] = A[i];
			i++;
			k++;
		}

		while (j < B.length) {
			result[k] = B[j];
			j++;
			k++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arrA = { 1, 2, 3, 4, 4 };
		int[] arrB = { 1, 2, 4, 5, 5 };

		int[] arrResult = mergeSortedArrays(arrA, arrB);

		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i] + " ");
		}

	}

}
