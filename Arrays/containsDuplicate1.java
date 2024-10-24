// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// ___________________________________________________________________________________________________________________________________________:)

  class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> visited = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(visited.contains(nums[i])){
                return true;
            }
            else{
                visited.add(nums[i]);
            }
        }
        return false;
    }
} 
