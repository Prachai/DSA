import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Practise2 {
// bubble sort	
	public static void bubbleSort(int[] array) 
	{
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max) 
			{
				max=array[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int array[] = {1,5,8,3,11,88,4,11};
		bubbleSort(array);
	}
}
