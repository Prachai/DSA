package Arrays;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static int even_Number_of_Digits(int[] numbers) {

		int evenCounts = 0;
		for (int element : numbers) {
			if (counting(element)) {
				evenCounts++;
			}
		}
		return evenCounts;
	}

	public static boolean counting(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		return count % 2 == 0;
	}

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		int evenDigitCounts = even_Number_of_Digits(nums);
		System.out.println("Find Numbers with Even Number of Digits " + evenDigitCounts);
	}
}
