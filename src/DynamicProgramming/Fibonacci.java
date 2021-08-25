package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {

    //Recursion
   public static int fibo(int n){
        if(n>2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    //TopDown
    static int fiboTD(int n, int[] dp){
       if(dp[n] == -1){
           dp[n] = fiboTD(n-1,dp) + fiboTD(n-2,dp);
       }
       return dp[n];
    }

    //BottomUp
    //0,1,1,2,3,5
    static int fiboBU(int n, int[] dp) {
        for (int i = 2; i <=n; i++) {
            if (dp[i] == -1)
                dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
       System.out.println(fibo(5));

       int[] dp = new int[100];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;

        System.out.println(fiboTD(5,dp));

        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fiboBU(5,dp));
    }
}
