package programs;

public class Vowel_in_String 
{
public static void main(String[] args) {

	String name="pradeep";
	String vowel="";
	
	for(int i=0;i<name.length();i++) 
	{
		if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
		{
			vowel=vowel+name.charAt(i);
		}
	}
	System.out.println(vowel);
}
}
