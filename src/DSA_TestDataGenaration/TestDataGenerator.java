package DSA_TestDataGenaration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDataGenerator 
{
private static final int MINLENGTH_USERNAME=7;
private static final int MAXLENGTH_USERNAME=15;
private static final int MINLENGTH_PASSWORD=10;
private static final int MAXLENGTH_PASSWORD=20;

private static final String ALLOWEDCHARACTERS="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

public static void main(String[] args)	
{
	List<String> validUSERNAME = genarateUserName(5);
	System.out.println(validUSERNAME);
	List<String> validpassword = genaratePassword(5);
	System.out.println(validpassword);
	
}

// allowing first char as numeric
public static List<String> genarateUserName(int samples) 
{
	List<String> list=new ArrayList<>();
	Random random=new Random();
	// iterate samples
	for(int i=0;i<samples;i++) 
	{
		StringBuilder builder=new StringBuilder();
		int userLegth=random.nextInt(MAXLENGTH_USERNAME-MINLENGTH_USERNAME+1)+MINLENGTH_USERNAME;
		for(int j=0;j<userLegth;j++) 
		{
			char charSeq = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()));
			builder.append(charSeq);
		}
		list.add(builder.toString());
	}
	return list;
} //ends

public static List<String> genaratePassword(int samples) 
{
 List<String> list=new ArrayList<>();
 Random random=new Random();
 for(int i=0;i<samples;i++)
 {
	 StringBuilder builder=new StringBuilder();
	 int userLength=random.nextInt(MAXLENGTH_PASSWORD-MINLENGTH_PASSWORD+1)+MINLENGTH_PASSWORD;
	 for(int j=0;j<userLength;j++) 
	 {
		 char sequence;
		 if(j==0) 
		 {
			 sequence = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()-10));		 

		 }else
		 {
			 sequence = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()));		 			 
		 }
		 builder.append(sequence);
	 }
	 list.add(builder.toString());
 }
 return list;
}
}
