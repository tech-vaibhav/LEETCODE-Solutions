//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.
// _________________________________________________________________________________________________________________________________)class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,1);
        int pre=1; int post=1;
        for(int i=0; i<nums.length;i++){
            result[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1; i>=0; i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}
