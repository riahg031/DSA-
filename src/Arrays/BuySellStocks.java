package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStock(prices));
    }
    public static int buySellStock(int[] prices){
        int maxProfit=0, buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){   //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else    //purchase stock
                buyPrice = prices[i];
        }
        return maxProfit;
    }
}
