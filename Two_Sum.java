// https://leetcode.com/problems/two-sum/description/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// // You can return the answer in any order.
// _____________________________________________________________________________________________________________________________________


class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length -1; i++){
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[]args)
    {
       
        int[] nums= {2,7,11,15};
        int target=9;

        System.out.println("nums = "+nums+", target = "+target);
        int[] output=twoSum(nums,target);
    }
}
