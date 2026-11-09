public class Q77BuySellStock {
//    brute force
    static int buySellStock(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int currentProfit = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);

            }
        }

        return maxProfit;
    }

//    Dynamic approach
    static int buySellStockOptimized(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
        public static void main(String[] args){
        int[] prices = {8, 2, 4, 1, 7};
        System.out.println(buySellStock(prices));
        System.out.println(buySellStockOptimized(prices));
    }
}
