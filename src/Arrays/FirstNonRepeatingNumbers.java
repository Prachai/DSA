package Arrays;

public class FirstNonRepeatingNumbers {

	public static void firstNonRepeating(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

	}

	// Driver code
	public static void main(String[] args) {

		int arr[] = { 9, 4, 9, 6, 7, 4 };
		firstNonRepeating(arr);
	}
}
