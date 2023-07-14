package Arrays;

public class BubbleSortArray {

	public static void bubblesort(int[] array) 
	{
		for(int i=0;i<array.length-1;i++) 
		{
		for(int j=0;j<array.length-1;j++)
		{
			if(array[j]>array[j+1]) 
			{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}	
		}
		for(int num:array) 
		{
			System.out.println("after sort   "+num);
		}

	}
	public static void main(String[] args) {
		int[] array= {1,66,33,22,1,7,8,4,55,20};
		bubblesort(array);
	}
}
