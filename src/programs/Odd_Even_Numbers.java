package programs;

public class Odd_Even_Numbers {

	public static void main(String[] args) 
	{
// add individual number		
		int num=343;
		int sum=0;

		while(num!=0) 
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("total sum "+sum);
// only odd number		
		int num1=343;
		int oddsum=0;
		int evensum=0;
		while(num1!=0) 
		{
			int rem=num1%10;
			if(rem%2==1) 
			{
				oddsum=oddsum+rem;
			}else {
				evensum=evensum+rem;
			}
			num1=num1/10;			
		}
		System.out.println("odd sum "+oddsum);
		System.out.println("even sum "+evensum);
		
		
	}

}
