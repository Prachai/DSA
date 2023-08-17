package Arrays;

public class MoveAllzerosToEndof {

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 3, 12, 0, 5, 0 };

		moveZeroesToEnd(array);

		// Printing the modified array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void moveZeroesToEnd(int[] arr) {
		int n = arr.length;
		int nonZeroIndex = 0;

		// Traverse the array
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				// If the current element is non-zero, move it to the nonZeroIndex position
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}

		// Fill the remaining elements with zeroes
		while (nonZeroIndex < n) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
	}

}
