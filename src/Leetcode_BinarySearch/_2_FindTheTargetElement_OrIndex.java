package Leetcode_BinarySearch;

public class _2_FindTheTargetElement_OrIndex {
	public static int binarySearch(int[] sortedArray,int targetValue) {

		int left=0;
		int right=sortedArray.length-1;
		
		while(left<=right) 
		{
			int mid =left+(right-left)/2;
			if(sortedArray[mid]==targetValue) {
				return mid;   // or sortedArray[mid]   --- to return that value
			}else if(sortedArray[mid]<targetValue) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1; //if target value not found
	}

	public static void main(String[] args) {
		int[] sortedArray = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		int targetValue = 7;
		int index = binarySearch(sortedArray,targetValue);
		
		if(index!=-1) {
			System.out.println("index of target value"+targetValue+" is "+index);
		}
	}
}
