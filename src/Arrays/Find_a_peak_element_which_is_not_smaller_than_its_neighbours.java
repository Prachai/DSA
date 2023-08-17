package Arrays;

public class Find_a_peak_element_which_is_not_smaller_than_its_neighbours {
	/*
	 * Input: array[]= {5, 10, 20, 15} Output: 20 Explanation: The element 20 has
	 * neighbors 10 and 15, both of them are less than 20.
	 */
	public static void peekAnElement(int[] array) {

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
				System.out.println(array[i]);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 1, 0 };
		peekAnElement(arr);
	}
}
