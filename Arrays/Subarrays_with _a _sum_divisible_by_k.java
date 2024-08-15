// https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.
// ________________________________________________________________________________________:)
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[]map=new int[k];
        map[0]=1; //(0,1) for handling cases
        int sum=0;
        int res=0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
            int mod=sum%k;
            if(mod<0){
                mod=mod%k + k;
            }
            res+=map[mod];
            map[mod]++;
        }
        return res;
    }
}
