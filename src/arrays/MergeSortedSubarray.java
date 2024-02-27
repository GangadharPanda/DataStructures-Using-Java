package arrays;

class MergeSortedSubarray {
	static void merge(int[] arr, int endIndex) {
		int i = 0;
		int j = endIndex + 1;
		int k = 0;
		int[] result = new int[arr.length];

		while (i <= endIndex && j < arr.length) {
			if (arr[i] < arr[j]) {
				result[k] = arr[i];
				i++;
			} else {
				result[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i <= endIndex) {
			result[k] = arr[i];
			i++;
			k++;
		}

		while (j < arr.length) {
			result[k] = arr[j];
			j++;
			k++;
		}

		for (i = 0; i < result.length; i++) {
			arr[i] = result[i];
		}

	}

	public static void main(String[] args) {
		int[] arrA = { 1, 3, 5, 7, 9, 11, 0, 4, 6, 8 };

		merge(arrA, 5);

		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
	}
}