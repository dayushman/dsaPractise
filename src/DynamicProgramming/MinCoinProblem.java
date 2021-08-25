package DynamicProgramming;

import java.util.Arrays;

public class MinCoinProblem {


    //Recursive
    static int minCoin(int[] coins,int amount){
        if (amount == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= amount) {
                ans = Math.min(ans, minCoin(coins, amount - coin) + 1);
            }

        }
        return ans;
    }

    //Top Down Dp
    static int minCoinTD(int[] coins, int amount,int[] dp){
        if (amount == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
           if (coin <= amount)
               ans = Math.min(ans,minCoinTD(coins, amount-coin, dp)+1);
        }
        dp[amount] = ans;
        return dp[amount];
    }

    //BottomUp DP
    static int minCoinsBU(int[] coins,int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int rupee = 1; rupee <= amount; rupee++) {
            for (int coin : coins) {
                if (coin <= rupee)
                    dp[rupee] = Math.min(dp[rupee],dp[rupee - coin]+1);
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5,10};
        System.out.println(minCoin(coins,13));
        System.out.println(minCoinsBU(coins,13));
        int[] dp = new int[14];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        System.out.println(minCoinTD(coins,13,dp));
    }
}
