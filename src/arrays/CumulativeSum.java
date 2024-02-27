package arrays;

/**
 * 
 * 
 * The cumulative sum of an array at index i is defined as the sum of all
 * elements of the array from index 0 to index i.
 * 
 * Examples Initial Array: [1, 2, 3, 4] Cumulative Sum: [1, 3, 6, 10] Initial
 * Array: [1, 1, 1, 1, 1] Cumulative Sum: [1, 2, 3, 4, 5] Initial Array: [1, 3,
 * 5, 7, 9] Cumulative Sum: [1, 4, 9, 16, 25] Given an array, return its
 * cumulative sum.
 * 
 * @author USER
 *
 */
public class CumulativeSum {

	static int[] getCumulativeSum(int[] arr) {
		int[] result = new int[arr.length];
		result[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result[i] = arr[i] + result[i - 1];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		arr = getCumulativeSum(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
