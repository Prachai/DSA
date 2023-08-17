package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElement_2Arrays {

	public static void commonElement(int[] array1, int[] array2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int element1 : array1) {
			set.add(element1);
		}

		for (int element2 : array2) {
			if (set.contains(element2)) {
				list.add(element2);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 3, 6 };
		commonElement(array1, array2);

	}
}
