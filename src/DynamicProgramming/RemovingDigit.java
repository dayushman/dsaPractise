package DynamicProgramming;

import java.io.*;
import java.util.*;

class RemovingDigits{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp,digit;
        long[] dp = new long[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int number = 1; number <= n; number++) {
            temp = number;
            while (temp!=0){
                digit = temp%10;
                if (digit!=0)
                    dp[number] = Math.min(dp[number],dp[number-digit]+1);
                temp/=10;
            }
        }
        System.out.println(n);
    }
}