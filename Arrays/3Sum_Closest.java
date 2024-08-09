// https://leetcode.com/problems/3sum-closest/description/
// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.
// ____________________________________________________________________________________________________________:)


import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];

        for(int i=0; i<nums.length-2; i++){
            int start=i+1;
            int end=nums.length-1;
            
            while(start<end){
                int currentSum=nums[i]+nums[start]+nums[end];

                if(currentSum==target){
                    return currentSum;
                }

                if(Math.abs(currentSum-target)<Math.abs(closestSum-target)){
                    closestSum=currentSum;
                }

                if(currentSum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return closestSum;
    }
}
