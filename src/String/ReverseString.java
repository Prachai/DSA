package String;

import java.util.Arrays;

public class ReverseString {

// #1  without array "" reverse it	
	public static void name1(String[] name) {
	    String rev="";    
	    for(int i=name.length-1;i>=0;i--) 
	    {
	    	rev=rev+name[i];           
	    }
	    System.out.println("1st programme  "+rev);		
		}

// #2 with "" reverse it
	public static void name2(String[] name) {
	    int left=0;
	    int right=name.length-1;
	    
	    while(left<right) {
	    	String temp=name[0];
	    	name[left]=name[right];
	    	name[right]=temp;
	    	left++;
	    	right--;
	    	}		
	    System.out.println(Arrays.toString(name));
		}

	public static void main(String[] args) {
	    String[] name={"h","e","l","l","o"};
		name2(name);
	}
}