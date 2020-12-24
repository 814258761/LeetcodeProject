public class Solution122 {
    class Solution {
        public int maxProfit(int[] prices) {

            if (prices.length == 1){
                return 0;
            }

            int tempPrice = -1;
            int profit = 0;
            for (int i = 0; i < prices.length; i++) {

                if (tempPrice == -1){
                    if (i + 1 < prices.length && prices[i+1] > prices[i]){
                        tempPrice = prices[i];
                    }
                } else {
                    if (i + 1 == prices.length || prices[i+1] < prices[i] ){
                        profit += prices[i] - tempPrice;
                        tempPrice = -1;
                    }
                }
            }

            return profit;
        }
    }
}
