package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizingCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        long[] coins = new long[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Long.parseLong(sc.next());
        }
        long[] dp = new long[c+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int rupee = 1; rupee <= c; rupee++) {
            for (long coin : coins) {
                if (coin <= rupee)
                    dp[rupee] = Math.min(dp[rupee],dp[(int) (rupee - coin)]+1);
            }
        }
        System.out.println(dp[c]);
    }
}
