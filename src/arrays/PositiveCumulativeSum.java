package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * The positive cumulative sum of an array is a list of only those cumulative sums which are positive.

	Examples
	Initial Array: [1, -2, 3, 4, -6]
	Cumulative Sum: [1, -1, 2, 6, 0]
	Positive Cumulative Sum: [1, 2, 6]
	Initial Array: [1, -1, -1, -1, 1]
	Cumulative Sum: [1, 0, -1, -2, -1]
	Positive Cumulative Sum: [1]
	Initial Array: [1, 3, 5, 7]
	Cumulative Sum: [1, 4, 9, 16]
	Positive Cumulative Sum: [1, 4, 9, 16]
	Given an array, return its positive cumulative sum.
 */
public class PositiveCumulativeSum {

	static List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		List<Integer> result = new ArrayList<>();
		int[] tempArr = new int[arr.length];
		
		if(arr[0] > 0){
			result.add(arr[0]);
			tempArr[0] = arr[0];
		}
		
		for(int i = 1; i < arr.length; i++){
			tempArr[i] = arr[i] + tempArr[i - 1];
			
			if(tempArr[i] > 0)
				result.add(tempArr[i]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, 4, -6 };
		List<Integer> result = getPositiveCumulativeSum(arr);
		for (Integer i : result) {
			System.out.print(i + " ");
		}
	}
}
