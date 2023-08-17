package Arrays;

public class Max_Consecutive_Ones {

	public static int max_Consecutive_Ones(int[] array) {

		int maxcount = 0;
		int currentCount = 0;
		for (int element : array) {
			if (element == 1) {
				currentCount++;
				maxcount = Math.max(maxcount, currentCount);
			} else {
				currentCount = 0;
			}
		}
		return maxcount;

	}

	public static void main(String[] args) {
		int array[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1 };
		int count = max_Consecutive_Ones(array);
		System.out.println("most consucative count " + count);
	}
}
