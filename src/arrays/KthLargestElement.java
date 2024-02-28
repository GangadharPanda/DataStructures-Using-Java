package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 
 * Given a list of numbers below:
	4, 3, 6, 4, 1
	
	What is the largest element in the list? → 6
	
	What is the 3rd largest element in the list? → 4
 * 
 */
public class KthLargestElement {
	
	static int getKthLargestElement(int[] arr, int k) {
	    // add your logic here
		
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i = 0; i < arr.length; i++){
			q.offer(arr[i]);
		}
		System.out.println(q);
		int result = 0;
		
		while(k!=0){ result = q.poll();k--;}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2, 3, 4, 5};
		int k = 1;
		System.out.println(getKthLargestElement(arr, k));
		int[] arr2 = {4, 3, 6, 4, 1};
		k = 3;
		System.out.println(getKthLargestElement(arr2, k));
	}

}
