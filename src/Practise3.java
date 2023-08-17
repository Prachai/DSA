import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practise3 {

//bubble sort	
public static void bubbleSort(int [] array) {

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
	for(int ele:array) 
	{
		System.out.print(ele);
	}
	System.out.println();
}	

//Reverse an array
public static void reverseArray(String name) {
	String[] input = name.split(" ");
	for(int i=input.length-1;i>=0;i--) 
	{
		System.out.print(input[i]+" ");
	}
	System.out.println();
}

// duplicate or repeating
public static void repeatingNumber(int [] array) {
	int n=array.length;
	int[] repeating= {};

	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++) 
		{
			if(array[i]==array[j]) 
			{
				System.out.print(array[j]);
				break;
			}
		}
	}
}

// move all zero to the end 
public static void moveZeros(int [] array) {
	int n=array.length;
	int nonZerIndex=0;
	for(int element:array) 
	{
		if(element!=0) 
		{
			array[nonZerIndex]=element;
			nonZerIndex++;
		}
	}
	while(nonZerIndex<n) 
	{
		array[nonZerIndex]=0;
		nonZerIndex++;
	}
	System.out.println();
	for(int ele:array) 
	{
		System.out.print(ele);
	}
}

//dutch national flag
public static void dutchNationalFlag(int[] array) {
	int n=array.length;
	int count0=0;
	int count1=0;
	
	for(int ele:array) 
	{
		if(ele==0) {
			count0++;
		} else if(ele==1) {
			count1++;
		}
	}
	int count=0;
	while(count0>0) {
		array[count++]=0;
		count0--;
	} while(count1>0) {
		array[count++]=1;
		count1--;
	}
	System.out.println();
	for(int ele:array) 
	{
		System.out.print(ele);
	}
}

//MaxMin
public static void maxMin(int [] array) {
	int max=0;
	int min=0;
	
	for(int ele:array) 
	{
		if(ele>max) {
			max=ele;
		}else if(ele<min) {
			min=ele;
		}
	}
	System.out.println();
	System.out.println(max);
	System.out.println(min);

}

//Missing
public static void missingNum(int[] array) {
	
	int n=array.length+1;
	int expSum=n*(n+1)/2;
	int actSum=0;
	for(int ele:array) 
	{
		actSum+=ele;
	}
	System.out.println(expSum-actSum+" missing no");
}

//firstNonRepeating
public static void firstNonRepeating(int [] array) {
	int n=array.length;
	
	int[] number=new int[n];
	for(int ele:array) 
	{
		number[ele]++;
	}
	
	for(int ele:array) 
	{
		if(number[ele]==1) 
		{
			System.out.println("1st non repeating"+ele);
		}
	}
	
}


//fibonacci
public static void fibonacci() {
int num1=0;
int num2=1;
int num3;	
for(int i=0;i<10;i++) 
{
	num3=num1+num2;
	num1=num2;
	num2=num3;
	System.out.print(num3+" ");
}	
}

//OddEven
public static void oddEven() {
	int num=2345602;
	while(num!=0) 
	{
		int rem=num%10;
		if(rem%2==0) {
			System.out.println("even no "+rem);
		}else {
			System.out.println("odd no "+rem);
		}
		num=num/10;
	}
// even sum and odd sum can be done
}

//palindrome
public static void palindrome() {
	int num=12321;
	int temp=num;
	int rev=0;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev) {System.out.println("palindrome"+rev);}
	else {System.out.println("not a palindrome"+rev);}
}

//primeNumber
public static void primeNumbers(int[] num) {
	for(int i=0;i<num.length;i++) 
	{
		boolean flag=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0) 
			{
				flag=false;
				break;
			}
		}
		if(flag) 
		{
		System.out.println("prime number"+i);
		}

	}
}

//LowerUpperCase
public static void lowerUpper() {
	String name="pradeep kumar meti";
	int length=name.length()/2;
	for(int i=0;i<name.length();i++)
	{
		if(i<length) {
			System.out.print(Character.toLowerCase(name.charAt(i)));
		}else if(i>length) {
			System.out.print(Character.toUpperCase(name.charAt(i)));			
		}
	}
}

//SubstringofString
public static void subString() {
	
}

//swapNumbers
public static void swappingTwoNumbers() {
int num1=12;
int num2=15;

num1=num1+num2; //27
num2=num1-num2; //12
num1=num1-num2; //15
System.out.println();
System.out.println("num1 "+num1);
System.out.println("num2 "+num2);

}

//VowelsInString
public static void vowelsInString() {
	
}

//how many repeated character in string
public static void repeatedCharacter(int [] array) {
	
	Set<Integer> integers=new HashSet<>();
	for(int ele:array) 
	{
		integers.add(ele);
	}
	System.out.println(integers);
		
}


public static void main(String[] args) {
	int [] array4= {1,2,0,2,4,0,5,6,0,1};
	bubbleSort(array4);
	String name= "pradeep is name my";
	reverseArray(name);	
	repeatingNumber(array4);
	moveZeros(array4);
	int [] array= {1,0,1,0,1,0,0,1,1};
	dutchNationalFlag(array);
	maxMin(array4);
	int [] array2= {1,2,3,5,6};
	missingNum(array2);
	firstNonRepeating(array4);
	fibonacci();
	oddEven();
	palindrome();
	int [] array5= {3,2,2,4,5,6,1,7,8};
	primeNumbers(array5);
	lowerUpper();
	swappingTwoNumbers();
	repeatedCharacter(array4);
}
}
