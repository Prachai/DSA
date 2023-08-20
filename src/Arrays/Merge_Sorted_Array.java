package Arrays;

import java.util.Arrays;

public class Merge_Sorted_Array {

	// with fixed length of nums1
	
	public static int[] sortedArrayMergeed(int[] array1,int array2[], int m,int n) {

		for(int i=0;i<n;i++)
		{
			array1[i+m]=array2[i];
		} 
		Arrays.sort(array1);
		return array1;
	}
// without fixed length
	public static void sortAndMergeArray() {

		int []nums1 = {1,2,3};
		int m = nums1.length;
		int []nums2 = {2,5,6};
		int n=nums2.length;
		
		int num3[]=new int[m+n-1];
		
		
		int i=0,j=0,k=0;
		while(i<m) {
			num3[k++]=nums1[i++];
		}
		while(j<n) {
			num3[k++]=nums2[j++];
		}
		
		for(int ele:num3) 
		{
			System.out.println(" "+ele);
		}
	}
	
	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int m = 3;
		int []nums2 = {2,5,6};
		int n = 3;
		int[] output = sortedArrayMergeed(nums1, nums2,m,n);
		for(int element:output) 
		{
			System.out.print(element+" ");
		}
}
}
