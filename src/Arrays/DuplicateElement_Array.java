package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement_Array {
public static void main(String[] args) {
	int [] array= {1,1,3,4,5,5,6,7,6};
	
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer> setdup=new HashSet<Integer>();

	for(int number:array) 
	{
		if(!set.add(number)) 
		{
			setdup.add(number);
		}
	}
	System.out.println("Duplicate array    "+setdup);
}
}
