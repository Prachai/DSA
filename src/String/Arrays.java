 package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Arrays {
// add positive numbers
	public static void addPositiveNumbers(int[] input) {
		int sum=0;
		for(int i=0;i<input.length;i++) 
		{
			if(input[i]>0) {
				sum=sum+input[i];
			}
		}
		System.out.println(sum);
	}
// remove duplicates use hashset
	public static void removeDuplicates(int[] input) {
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<input.length;i++) {
			set.add(input[i]);
		}
		System.out.println(set);

		// set to arrays		
		int[] num=new int[set.size()];
		int value=0;
		
		for(int numb:set) {
			num[value]=numb;
			value++;
		}
				
	}
// join two  arrays	
	
	
	public static void main(String[] args) {
	int[] name={1,-6,5,9,4,6,-3,-10};
	addPositiveNumbers(name);
	
	// removing duplicates
	int[] numbersWithDuplicates = {1, 2, 3, 2, 5, 3, 4};
	removeDuplicates(numbersWithDuplicates);
	
}
}
