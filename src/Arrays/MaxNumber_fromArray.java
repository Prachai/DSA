package Arrays;

public class MaxNumber_fromArray {
public static void main(String[] args) {
	int [] array= {22,4,22,3,54,5,93};
	
	int max=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]>max) 
		{
			max=array[i];
		}
		}
	System.out.println(max);
}
}
