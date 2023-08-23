package Leetcode;

public class _1_Remove_Duplicates_from_Sorted_Array {

	public static int removeDuplicatesSortedArray(int[] nums) {
		    int i = 0;
		    for (final int num : nums)
		      if (i < 1 || num > nums[i - 1])
		      {
		        nums[i++] = num;
		      }
		    return i;
		  }
		
	public static void removeDuplicatesFromArray(int [] array) {
		
		int length=array.length;
		
		for(int i=0;i<length;i++) 
		{
			for(int j=i+1;j<length;j++) 
			{
				if(array[i]==array[j]) 
				{
					array[i]=array[length-1];
					length--;
					j--;
				}
			}
		}
		
		int [] result=new int[length];
		System.arraycopy(array, 0, result, 0, length);
		
		for(int ele:result) 
		{
			System.out.println(ele);
		}
	}
	
	
	public static void main(String[] args) {
	int array[]= {1,1,2,2,3,3,4,4,5,5,6,6,7,7};
	int i=removeDuplicatesSortedArray(array);
	System.out.println(i);
	System.out.println();
	
	int[] array1 = { 1, 2, 3, 4, 2, 3, 5 };
	removeDuplicatesFromArray(array1);
	
	
}
}
