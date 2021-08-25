package DynamicProgramming;

import java.util.Arrays;

public class LadderProblem {

    //Recursive Approach takes O(k power n) time
    static int ladderRec(int n,int k){
        if(n<0)
            return 0;
        if (n==0 || n==1)
            return 1;
        return 2*ladderRec(n-1,k) - ladderRec(n-k-1,k);
    }

    //Bottom Up Approach O(nk)
    //Assumptions k>1 n>1
    static int ladderBU(int n,int k){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int step = 1; step <=n; step++) {
            dp[step] = 0;
            for (int j = 1; j <=k; j++) {
                if (step-j >= 0)
                    dp[step]+=dp[step-j];
            }
        }
        return dp[n];
    }

    //BottomUp Approach o(n)
    //Assumptions K>1 n>1

    //Formula Derivation
    //dp[n]   = dp[n-1] + dp[n-2] + .....          +dp[n-k]
    //dp[n-1] =           dp[n-2] + dp[n-3] + .....+dp[n-k] + dp[n-k-1]
    //dp[n] - dp[n-1] = dp[n-1] - dp[n-k-1]
    //dp[n] = 2*dp[n-1] - dp[n-k-1]
    static int ladderBUOpt(int n,int k){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int step = 2; step <=n; step++) {
            if (step>k)
                dp[step] = 2*dp[step-1] - dp[step-k-1];
            else
                dp[step] = 2*dp[step-1];

        }
        return dp[n];
    }

    //TopDown Approach

    static int ladderTD(int n,int k,int[] dp){
        if(n < 0)
            return 0;
        if(dp[n] == -1)
            dp[n] = 2 * ladderTD(n-1,k,dp) - ladderTD(n-k-1,k,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(ladderRec(4,3));
        System.out.println(ladderBU(4,3));
        System.out.println(ladderBUOpt(4,3));
        int[] dp = new int[8];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(ladderTD(4,3,dp));
    }
}
