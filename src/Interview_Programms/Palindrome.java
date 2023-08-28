package Interview_Programms;

public class Palindrome 
{
public static void main(String[] args) 
{
String name="gadag";
String rev="";

for(int i=name.length()-1;i>=0;i--) 	
{
	rev=rev+name.charAt(i);
}
System.out.println(rev);

if(rev.equals(rev)) 
{
System.out.println("palindrome");	
}
else 
{
System.out.println("not a palindrome");	
}
}
}
