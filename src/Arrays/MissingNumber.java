package Arrays;

public class MissingNumber {

	public static void name(int array[]) {
		int n = array.length + 1;
//		int n=array.length+2;

		int actualSum = n * (n + 1) / 2;
		int missingSum = 0;

		for (int i = 0; i < n - 1; i++) {
			missingSum += array[i];
		}
		System.out.println(actualSum - missingSum);
	}

	public static void main(String[] args) {
//		int array[]= {1,2,3,5,6,7,9};
		int array[] = { 1, 2, 3, 5, 6, 7 };

		name(array);
	}
}
