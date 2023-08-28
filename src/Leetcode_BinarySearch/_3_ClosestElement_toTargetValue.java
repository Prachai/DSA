package Leetcode_BinarySearch;

public class _3_ClosestElement_toTargetValue {

	public static int binarySearch(int[] sortedArray,int targetValue) {
		
		int left=0;
		int right=sortedArray.length-1;
		int closest=sortedArray[0];
		
		
		while(left<=right) 
		{
			int middle=left+(right-left)/2;
			if(sortedArray[middle]==targetValue) {
				return sortedArray[middle];
			}else if(sortedArray[middle]<targetValue) {
				closest=sortedArray[middle];
				left=middle+1;
			}else {
				closest=sortedArray[middle];
				right=middle-1;
			}
		}
		return closest;
	}
	
	public static void main(String[] args) {
		int[] sortedArray = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		int targetValue = 8;
		int closestValue = binarySearch(sortedArray,targetValue);
		System.out.println("cloestest value is "+closestValue);
	}
}
