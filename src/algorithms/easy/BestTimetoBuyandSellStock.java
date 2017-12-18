package algorithms.easy;

/**
 * @author mamamiyear
 *         on 2016/5/11
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * 给你一个数组，其中第i个数字是第i天的股票价格，现只允许你进行一次买卖，请求出最大的收益
 * 实质就是求当i>j时所能得到的最大的array[i]-array[j]
 *
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int lowest = prices[0];
        int highest = prices[0];
        int profit = highest - lowest;
        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            if (current < lowest) {
                lowest = current;
                highest = current;
            }
            if (current > highest) highest = current;
            int curProfit = highest - lowest;
            if(curProfit > profit) profit = curProfit;
        }
        return profit;
    }
}
