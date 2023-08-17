package Arrays;

public class Repeating_number {

	public static void letsDoIt(int[] array) {
		int n = array.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 4, 5, 6, 4, 7, 3, 2 };
		letsDoIt(array);
	}
}
