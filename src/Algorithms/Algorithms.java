package Algorithms;

public class Algorithms 
{
// recursion	
public static int fact(int num) {
	 if (num == 0 || num == 1)
	 {
         return 1;
     }
	 return num*fact(num-1);
}
	
	public static void main(String[] args) {
		int number=5;
		int vaue = fact(number);
		System.out.println(vaue);
	}
}
