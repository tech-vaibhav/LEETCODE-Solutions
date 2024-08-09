// https://leetcode.com/problems/container-with-most-water/
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.
// _____________________________________________________________________________________________:)

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int lh=height[l];
            int rh=height[r];
            int len=r-l;
            int min_h=Math.min(lh,rh);
            int curr_area=min_h*len;
            max=Math.max(max,curr_area);
            if(lh<rh)l++;
            else{
                r--;
            }
        }
        return max;
    }
}
