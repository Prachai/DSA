package Arrays;

public class Remove_Duplicates_from_Sorted_Array {

	public static int deleteDuplicateElement(int [] array) {
		int count=0;
		for(int ele:array) 
		{
			if(count<1 || ele>array[count-1]) 
			{
				array[count++]=ele;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int array[]= {0,0,1,1,1,2,2,3,3,4};
		int count=deleteDuplicateElement(array);
		System.out.println(count);
	}
	
}
