// https://leetcode.com/problems/first-missing-positive/description/
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// ___________________________________________________________________________________:)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0&& nums[i]<=nums.length&& nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;

            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){  
                return j+1;
            }
        }
        return nums.length+1; // for missing numnber is n.
    }
    static void swap(int[]nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
