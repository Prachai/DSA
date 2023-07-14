package String;

public class First_Unique_Character {

public static int Unique_Character(String name) 
{
int[] count=new int[26];
for(int i=0;i<name.length();i++)
{
char c=name.charAt(i);
count[c-'a']++;
}

for(int i=0;i<name.length();i++)
{
char c=name.charAt(i);
if(count[c-'a']==1) 
{
	return i;
}
}
return -1;	
}


public static void main(String[] args) {
String input="eetcode";
int output=Unique_Character(input);
System.out.println(output);
}
}
