// Pattern: Greedy + Prefix Minimum
// Core move: Track lowest minPrice so far + best profit
// Lower price  → update minPrice
// Higher price → try selling, update maxProfit
// Reason it works: Best sell depends on min price before it
// minPrice always happens before sell (left → right scan)
// Time: O(n)
// Space: O(1)
 
 
class BestTimetoBuyandSellStock{
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            int profit=prices[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}