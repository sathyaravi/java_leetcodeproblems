package leetcodeprograms.easy;

import java.util.Arrays;

public class ArrayPermutationWithoutusingExtraSpace {

	public static void main(String[] args) {
		
		int[] nums  = {0,2,1,5,3,4};
		
		int n = nums.length;
		
		for(int i=0;i<n;i++) {
			
			nums[i]=nums[i]+(nums[nums[i]]%n)*n;
			
		}
		
		for(int i=0;i<n;i++) {
			
			nums[i]=nums[i]/n;
		}
		
		
		System.out.println(Arrays.toString(nums));

	}

}
