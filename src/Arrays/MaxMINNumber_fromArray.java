package Arrays;

public class MaxMINNumber_fromArray {
	public static void main(String[] args) {
		int[] array = { 22, 4, 22, 3, 54, 5, 93 };

		int max = array[0];
		int min = array[0];
		for (int element : array) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}
		System.out.println("max  " + max);
		System.out.println("min  " + min);

	}
}
