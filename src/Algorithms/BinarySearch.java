package Algorithms;

public class BinarySearch {

	public static int binary(int [] array,int target) {
		int low=0;
		int high=array.length-1;
		
		while(low<=high) 
		{
			int mid=low+(high-low)/2;
			if(array[mid]==target) {
				return mid;
			}
			else if(array[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,6,8,3,5,7,9,1};
		int target=9;
		int value = binary(array,target);
		System.out.println("index of 9 is "+value);
	}
}
