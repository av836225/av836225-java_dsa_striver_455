package Array;

public class stock_to_buy_sell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit is: " + maxProfit);
    }

    public static int maxProfit(int[] nums){

        int maxProfit = 0;
        int minimum = nums[0];

        for(int i = 0;i < nums.length; i++){
            int cost =  nums[i] - minimum;
            maxProfit = Math.max(maxProfit, cost);
            minimum = Math.min(minimum, nums[i]);
        }

        return maxProfit;

    }
}
