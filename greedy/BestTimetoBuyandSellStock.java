// Pattern: Greedy + Prefix Minimum
// Core move: Track lowest buy so far + best profit
// Lower price  → update buy
// Higher price → try selling, update maxProfit
// Reason it works: Best sell depends on min price before it
// Buy always happens before sell (left → right scan)
// Time: O(n), Space: O(1)
 
 
class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            int profit=prices[i]-buy;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}