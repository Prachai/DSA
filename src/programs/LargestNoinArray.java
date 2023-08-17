package programs;

public class LargestNoinArray {

	
	public static void main(String[] args) {
		
		int value[]= {1,3,3,4,5,6,67};
		int max=value[0];
		
		for(int i=0;i<value.length;i++) 
		{
			if(value[i]>max) 
			{
				max=value[i];
			}
		}
		System.out.println(max);
	}
}
