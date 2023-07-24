package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maps_ {
	
	// Creating a hashmap and using entryset to iterate and get the value
	public static void itearing() 
	{
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("user 1", 101);
		map.put("user 3", 102);
		map.put("user 2", 103);
		
		int count=1;
		
		while(map!=null && count<=map.size())    // we can use for or while its just a demonstartion
		{
			if(map.containsKey("user 1")) {
				System.out.println("User 1 has found");
			}
			count++;
		}
		
		for(Map.Entry<String, Integer> element: map.entrySet()) {
			System.out.println("key:-  "+element.getKey()+"" +"  and value:-   "+element.getValue()+"");
		}	
	}

	
// Lets go indepth 
	
	public static void inDepthHashMap() {
		HashMap<String, List<String>> map=new HashMap<String, List<String>>();
		
		List<String> G=new ArrayList<String>();
		G.add("ghana");
		G.add("ghost");
		
		List<String> I=new ArrayList<String>();
		I.add("India");
		I.add("Inhale");
		
		map.put("G",G);
		map.put("I", I);
		
		List<String> list = map.get("I");
		for(String s:list) 
		{
			System.out.println(s);
		}
	}
	
// 
	
	
	public static void main(String[] args) {

		Maps_.inDepthHashMap();
	}
}
