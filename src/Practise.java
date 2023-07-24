import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practise {
	private static final int MINLENGTH_USERNAME = 8;
	private static final int MAXLENGTH_USERNAME = 15;
	private static final int MINLENGTH_PASSWORD = 14;
	private static final int MAXLENGTH_PASSWORD = 20;

	private static final String ALLOWEDCHARACTERS = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static void main(String[] args) {
		 List<String> validUserName = genarateUsername(10);
		 for(String seq:validUserName) {
			 System.out.println(seq);		 
			 }
		 
		 List<String> validPassword = genaratePassword(10);
		 for(String passwordseq:validPassword) 
		 {
			 System.out.println(passwordseq);
		 }
	}

	public static List<String> genarateUsername(int count) {
		List<String> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			StringBuilder builder = new StringBuilder();
			int userlength = random.nextInt(MAXLENGTH_USERNAME - MINLENGTH_USERNAME + 1) + MINLENGTH_USERNAME;

			for (int j = 0; j < userlength; j++) {
				char sequence = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()));
				builder.append(sequence);
			}
			list.add(builder.toString());
		}
		return list;
	} //method ends

	public static List<String> genaratePassword(int count) 
	{
		List<String> list=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<count;i++) 
		{
			StringBuilder builder=new StringBuilder();
			int userLength=random.nextInt(MAXLENGTH_PASSWORD-MINLENGTH_PASSWORD+1)+MINLENGTH_PASSWORD;
			for(int j=0;j<userLength;j++) 
			{
				if(j==0) 
				{
				char userSeq = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()-10));
				builder.append(userSeq);
				}
				else 
				{
				char userSeq = ALLOWEDCHARACTERS.charAt(random.nextInt(ALLOWEDCHARACTERS.length()));
				builder.append(userSeq);
				}
			}
			list.add(builder.toString());
		}
		return list;		
	} //method ends
}