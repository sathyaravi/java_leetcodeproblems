package leetcodeprograms.easy;

import java.util.Arrays;

public class ConcatenateArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		 
        ConcatenateArray obj = new ConcatenateArray();
        int[] result = obj.concatenateArray(nums);

        System.out.println(Arrays.toString(result));


	}

	public int[] concatenateArray(int[] nums) {
		// TODO Auto-generated method stub
		
		int n = nums.length;
		
		int[] ans = new int[2*n];
		
		for(int i=0;i<ans.length;i++) {
			
			ans[i]=nums[i%n];
		}
		
		
		return ans;
	}

}
