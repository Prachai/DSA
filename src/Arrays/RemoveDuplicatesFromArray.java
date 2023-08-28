package Arrays;

public class RemoveDuplicatesFromArray {

	public static void removeDuplicatesFromArray(int[] array) {
		
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
		int result[]=new int[length];
		System.arraycopy(array, 0, array, 0, length);
		
		System.out.println(result.length); // 5 verified
		                                   // Iterate if required
	}
	
	
public static void main(String[] args) {
	int[] array1 = { 1, 2, 3, 4, 2, 3, 5 };
	removeDuplicatesFromArray(array1);

}	
}
