package programs;

public class PrimeNumber {
public static void main(String[] args) {
	
	int [] num= {1,3,5,6,8,2,33,97};
	
	for(int i=0;i<num.length;i++) 
	{
		boolean flag=true;
		for(int j=2;j<num[i];j++) 
		{
			if(num[i]%j==0) 
			{
				flag=false;
				break;
			}
		}
		if(flag) 
		{
			System.out.println(num[i]);
		}
	}
	
}
}
