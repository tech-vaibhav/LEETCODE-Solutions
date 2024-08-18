// https://leetcode.com/problems/search-insert-position/description/
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// _________________________________________________________________________________________________________________________:)
class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end= nums.length -1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[]args)
    {
        int []nums={1,3,5,6};
        int target=5;
        int ans=searchInsert(nums,target);
        System.out.println(ans);
    }
}
