public class StockProfit {

    static class Solution {
        public int maxProfit(int[] prices) {

            if (prices == null || prices.length == 0) {
                return 0;
            }

            int buy = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices) {

                if (price < buy) {
                    buy = price;  // update minimum buying price
                } else {
                    maxProfit = Math.max(maxProfit, price - buy);
                }
            }

            return maxProfit;
        }
    }

    // psvm
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution sol = new Solution();
        int profit = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);
    }
}