package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElement_1Array {

	public static void commonElement(int[] array1) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int element1 : array1) {
			if (!set.contains(element1)) {
				set.add(element1);
			} else {
				list.add(element1);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 4 };
		commonElement(array1);

	}
}
