// https://leetcode.com/problems/maximum-distance-in-arrays/description/?envType=daily-question&envId=2024-08-16
// You are given m arrays, where each array is sorted in ascending order.

// You can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a - b|.

// Return the maximum distance.
// __________________________________________________________________________________________________________________________________:)

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result=Integer.MIN_VALUE;
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int min=arrays.get(0).get(0);

        for(int i=1; i<arrays.size();i++){
            result=Math.max(result,Math.abs(arrays.get(i).get(0)-max));
            result=Math.max(result,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min));

            max=Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
            min=Math.min(min, arrays.get(i).get(0));
        }
        return result;
    }
} 
