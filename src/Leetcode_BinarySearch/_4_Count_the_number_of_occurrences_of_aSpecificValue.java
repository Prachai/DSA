package Leetcode_BinarySearch;

public class _4_Count_the_number_of_occurrences_of_aSpecificValue {

	public static int binarySearch(int[] array,int targetValue, boolean flag) {
		
		int left=0;
		int right=array.length-1;
		int count=-1;
		
		while(left<=right)
		{
			int middle=left+(right-left)/2;
			
			if(array[middle]==targetValue) 
			{
				count=middle;
				if(flag) {
					right=middle-1;
				}else {
					left=middle+1;
				}
			}else if(array[middle]>targetValue) {
				right=middle-1;
			}else {
				left=middle+1;
			}
		}
		return count;
	}
		
		
	public static void main(String[] args) {
		int[] sortedArray = { 1, 3, 5, 7, 9, 11,11,11,11,11,11,11,11, 13, 15, 17 };
		int targetValue = 11;
		int first=binarySearch(sortedArray,targetValue,true);
		int last=binarySearch(sortedArray,targetValue,false);
		
		int count=last-first+1;
		if(count!=-1) {
			System.out.println(count);
		}
	}
}
