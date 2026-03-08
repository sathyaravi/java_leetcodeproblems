package leetcodeprograms.medium;

import java.util.Arrays;

public class FindFirstandLastPost_BinarySearch {
		public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10} ;
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(nums,target)));

	}

    public static int[] searchRange(int[] nums, int target) {

		        int first_pos=findFirst(nums,target);
		        int last_pos=findLast(nums,target);

		        return new int[]{first_pos,last_pos};
		       
    }  
		    private static int findFirst(int[]nums,int target){
		        int left = 0;
		        int right = nums.length-1;
		        int pos=-1;
		        //to find first position
		        while(left<=right){

		            int mid=left+(right-left)/2;

		            if(nums[mid]==target){
		                pos=mid;
		                right=mid-1;
		            }
		            else if(nums[mid]>target){
		                right=mid-1;
		            }
		            else{
		                left=mid+1;
		            }

		        }
		        return pos;

		    }

		    private static int findLast(int[] nums,int target){
		        int left = 0;
		        int right = nums.length-1;
		        int pos=-1;
		          //to find last position
		        while(left<=right){
		            int mid=left+(right-left)/2;
		            if(nums[mid]==target){
		                pos=mid;
		                left=mid+1;
		            }
		            else if(nums[mid]>target){
		                right=mid-1;
		            }
		            else{
		                left=mid+1;
		            }
		        }

		        return pos;
		    }


		    



	}


