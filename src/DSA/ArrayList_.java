package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_ {

public static void main(String[] args) {
		
	List<String> list=new ArrayList<String>();	
	
	list.add("chai");                                        // add 
	list.add(1,"coffee");                                    // add with index
	list.add("Ameow");
	
	
	List<String> list2=new LinkedList<String>(list);         // copy from list to list 
	for(String str:list2)                                    // Iteration
	{ 
		System.out.println(str);                            
	}
	
	System.out.println(list2.contains("chai"));              // contains
	
	System.out.println(list2.get(1));	                     // index
	Iterator<String> itr = list2.iterator();                 // Iterator
	while(itr.hasNext()) {
		System.out.print(itr.next());
	}
	
	list2.size();                                            // for collections to count---- size()
	String[] arr=list2.toArray(new String[0]);               // list to array conversion 0 represents size has not defined
	for(String element:arr) {
		System.out.println(element);
	}
	
	Collections.sort(list2);                                 // sort
	System.out.println(list2); // or use loop
	
	// To check if an array value is contained in a list in Java
	String [] str= {"chai","phew"};
	
	for(String value:str)                                    // iterating arrays
	{
		if(list.contains(value)) 
		{
			System.out.println("Performed if an array value is contained in a list in Java");
		}
	}
}}