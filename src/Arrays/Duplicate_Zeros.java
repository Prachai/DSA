package Arrays;

public class Duplicate_Zeros {

	public static void name(int [] array) {
	
		int[] result=new int[array.length];
		int index=0;
		
		for(int i=0;i<array.length && index<result.length;i++) 
		{
			if(array[i]==0) 
			{
				result[index++]=0;
				if(index<result.length) 
				{
					result[index++]=0;
				}
			}
			else 
			{
				result[index++]=array[i];
			}
		}
		
		for(int element:result) 
		{
			System.out.print(element+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,5,0};	
		name(arr);
	}
}



//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]