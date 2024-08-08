// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).
// ______________________________________________________________________________________________________________________

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        System.arraycopy(nums1, 0, mergedArray, 0, m);
        System.arraycopy(nums2, 0, mergedArray, m, n);

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Find the median
        if ((m + n) % 2 != 0) {
            return mergedArray[(m + n) / 2];
        } else {
            int mid1 = (m + n) / 2;
            int mid2 = mid1 - 1;
            return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        }
    }
}
