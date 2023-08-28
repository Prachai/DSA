package Interview_Programms;

public class Swap_without_thirdVar
{

public static void main(String[] args) {
	int num1=44;
	int num2=55;
	
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println(num1);
	System.out.println(num2);
	
	
	int temp;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println(num1);
	System.out.println(num2);

	
}

}
