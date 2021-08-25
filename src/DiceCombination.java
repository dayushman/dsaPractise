import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class DiceCombination {
    public static void main(String[] args) {
        long mod = 1000000007;
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        long[] dp = new long[n+1];
        Arrays.fill(dp,0);
        dp[0] =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=6; j++) {
                if (i>=j)
                    dp[i] = dp[i] + dp[i-j];
                if (dp[i]>=mod)
                    dp[i]-=mod;
            }
        }
        System.out.println(dp[n]);
    }
}