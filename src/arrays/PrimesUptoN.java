package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Given a number, let’s say 10. Can you tell all the divisors of the number?

	For 10, there are 4 divisors (1, 2, 5 & 10).
	Let’s take 5, it has 2 divisors (1 & 5).
	
	A Prime number is a number that has exactly two divisors → 1 and itself.
	Note: 1 is not a prime number.
	
	Divisors of Numbers:
	2 → 1, 2
	3 → 1, 3
	5 → 1, 5
	7 → 1, 7
	
	Given a number, find all the prime numbers from 1 to that number.
 * 
 * 
 */
public class PrimesUptoN {

	// Using Eratosthene’s method

	// Idea is simple , if a number is prime, mark all number greater than that
	// number which is divible by this prime number
	private static List<Integer> primesUptoNOptimal(int n) {
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				// Update all multiples of p greater than or
				// equal to the square of it numbers which
				// are multiple of p and are less than p^2
				// are already been marked.
				// for 2 = 4 , 6, 8, 10, 12 ...100
				// for 3 = 9, 12, 15, 18, 21, 24 ... 99
				
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}

		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				answer.add(i);
			}
		}
		return answer;
	}

	// Time complexity : O(n*root n)i.e n^3/2
	private static List<Integer> primesUptoN(int n) {

		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (countDivisor(i) == 2)
				list.add(i);
		}
		return list;
	}

	// Time Complexity - O(root of n)
	private static int countDivisor(int n) {
		int i = 1;
		int count = 0;
		while (i * i <= n) {
			if (n % i == 0) {
				if (n / i == i) {
					count++;
				} else {
					count += 2;
				}
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(primesUptoN(20));
		System.out.println(primesUptoNOptimal(20));
	}

}
