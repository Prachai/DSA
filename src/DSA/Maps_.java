package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps_ {
	public static void main(String[] args) {

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
}
