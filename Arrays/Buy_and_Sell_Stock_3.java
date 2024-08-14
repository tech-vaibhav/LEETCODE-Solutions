// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete at most two transactions.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
//__________________________________________________________________________________________________:)
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[]left=new int[n];
        int[]right=new int[n];
        int lmin=prices[0],rmax=prices[n-1];

        //first purchase
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1],prices[i]-lmin);
            lmin=Math.min(lmin,prices[i]);
        }
        //second purchase
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],rmax-prices[i]);
            rmax=Math.max(rmax,prices[i]);
        }

        int profit=right[0];
        for(int i=1;i<n;i++){
            profit=Math.max(profit, left[i-1]+right[i]);
        }
        return profit;
    }
}
