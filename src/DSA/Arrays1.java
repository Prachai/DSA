package DSA;

import java.util.Arrays;

public class Arrays1 implements Comparable<Arrays1>{
	private int age;
	private String name;
	private int salary;
	
	public Arrays1(int age,String name,int salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
// sorting
	public static void sorting() 
	{
		int [] num= {1,4,7,3,0,5,8,2,4,1,0};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}
// comparision
	public static void comparision() {
		String[] name1= {"chai","p"};
		String[] name2= {"cha","p"};
		System.out.println(name1.equals(name2));
	}
	
	public int compareTo(Arrays1 arr) {
		
		return 0;
	}

	
	public static void main(String[] args) {
		sorting();
		comparision();
		
		Arrays1[] emp=new Arrays1[4];
		emp[0]=new Arrays1(26,"prad",5000);
		emp[1]=new Arrays1(28,"pradeep",7000);
	}
}
