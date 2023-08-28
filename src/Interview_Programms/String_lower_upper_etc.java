package Interview_Programms;

import java.util.Iterator;
import java.util.Scanner;

public class String_lower_upper_etc 
{
	public static void main(String[] args) {
		// remove space
		String name=" Pradeep ";
		String wit_space=name.replace(" ", "");
		System.out.println(wit_space);

		//identifies vowels, consonants, whitespace, and special characters in a given string:
		Scanner scanner=new Scanner(System.in);
		System.out.println("entr the string");
		String name1=scanner.nextLine();
		
		int vowels=0;
		int consts=0;
		int whitespaces=0;
		int specialchar=0;
		
		for(int i=0;i<name1.length();i++) 
		{
			char c=name1.charAt(i);
			if(Character.isLowerCase(c))
			{
				vowels++;
			}else if (Character.isUpperCase(c))
			{
				consts++;
			}else if (Character.isWhitespace(c))
			{
				whitespaces++;
			}else 
			{
				specialchar++;
			}
			}
			System.out.println("vowels "+vowels);
			System.out.println("consonents "+consts);
			System.out.println("special char "+specialchar);
			System.out.println("whitespaces "+whitespaces);

		
		
		}
	}	
