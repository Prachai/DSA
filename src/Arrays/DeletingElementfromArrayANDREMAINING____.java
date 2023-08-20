package Arrays;

public class DeletingElementfromArrayANDREMAINING____ {

	public static int deleteTargetElementFromArray(int []nums ,int val) {

		int countIndex=0;
		
		for(int i=0;i<nums.length;i++) 
		{
			if(nums[i]!=val) 
			{
				nums[countIndex++]=nums[i];
			}
		}
		
		return countIndex;
	}
	
	public static void main(String[] args) {
		int []nums = {3,2,2,3};
		int val = 3;
		int count = deleteTargetElementFromArray(nums,val);
		System.out.println(count);
	}
}
