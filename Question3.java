public class Question3 {
//    public static int solution(int[] prices) {
//        int i = 0;
//        int j = 1;
//        int maxProfit = 0;
//
//        while (i < prices.length - 1) {
//            if (prices[i] >= prices[j]) {
//                i++;
//                j++;
//            } else {
//                int max = prices[j];
//                while (j < prices.length && prices[j] >= prices[i]) {
//                    max = Math.max(max, prices[j]);
//                    j++;
//                }
//                int profit = max - prices[i];
//                maxProfit = Math.max(maxProfit, profit);
//                i = j;
//                j++;
//            }
//        }
//        return maxProfit;
//    }

    public static int solution(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(solution(prices));
    }
}
