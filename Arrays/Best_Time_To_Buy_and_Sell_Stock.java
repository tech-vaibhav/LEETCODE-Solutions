// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
// ___________________________________________________________________________________________________________________________:)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int price: prices){
            if (price<minPrice){
                minPrice=price;
            }

            int profit=price-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
 
