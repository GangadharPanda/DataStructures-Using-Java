package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.

	Examples
	Array: [1, 2, 3, 2, 1]
	Number of Identical Twins: 2
	Explanation:
	Identical Twins: [[1, 1], [2, 2]]
	Indexes: (0, 4), (1, 3)
	Array: [1, 2, 2, 3, 2, 1]
	Number of Identical Twins: 4
	Explanation:
	Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
	Indexes: (0, 5), (1, 2), (1, 4), (2, 4)
	Array: [1, 1, 1, 1]
	Number of Identical Twins: 6
	Explanation:
	Identical Twins: [[1, 1], [1, 1], [1, 1], [1, 1], [1, 1], [1, 1]]
	Indexes: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)
	Given an array nums, find the number of identical twins.
 */
public class IdenticalTwins {

	private static int getIdenticalTwinsCountBF(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					result++;
			}
		}
		return result;
	}

	/*
	 * Array: [1, 2, 2, 3, 2, 1]
	 * 
	 * Element   | Count   | Total Countribution
	 *   1         2        2 * (2 - 1)/2 = 1  (1, 1)
	 *   2         3        3 * (3 - 1)/2 = 3  (2, 2) (2, 2), (2, 2)
	 *   3         1        1 * (1 - 1)/2 = 0 // We can ignore where count = 1
	 * 
	 */
	private static int getIdenticalTwinsCountWithMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int ans = 0;
		for (Integer i : map.values()) {
			if (i > 1)
				ans += i * (i - 1) / 2;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 2, 1 };
		int result = getIdenticalTwinsCountBF(arr);
		System.out.println(result);

		result = getIdenticalTwinsCountWithMap(arr);
		System.out.println(result);
	}
}
