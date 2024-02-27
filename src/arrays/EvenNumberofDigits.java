package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an array of integers, find the elements which have an even number of
 * digits.
 * 
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442] Answer: 42, 5775,
 * 34, 45, 3556
 * 
 * The order of the returned elements should be the same as the order of the
 * initial array.
 *
 */
public class EvenNumberofDigits {

	private static List<Integer> getEvenDigitNumbers(int[] arr) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			String valueInStr = arr[i] + "";
			if (valueInStr.length() % 2 == 0) {
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442 };
		List<Integer> list = getEvenDigitNumbers(arr);

		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
