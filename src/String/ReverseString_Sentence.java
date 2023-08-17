package String;

public class ReverseString_Sentence {

	
	public static void reverse(String name) {
		String[] splitted = name.split(" ");
		
		for(int i=splitted.length-1;i>0;i++) 
		{
			System.out.println(name);
		}
		
	}
	public static void main(String[] args) {
		String name="pradeep is name my";
		reverse(name);
	}
}
