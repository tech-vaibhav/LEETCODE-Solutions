// Given an integer array nums and an integer k, 
// return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
// _______________________________________________________________________________________________________________________________:)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
                if(set.size()>k){
                    set.remove(nums[i-k]);
                }
            }
        }
        return false;
    }
}
