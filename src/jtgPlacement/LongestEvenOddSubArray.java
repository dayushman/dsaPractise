package jtgPlacement;

public class LongestEvenOddSubArray {
    public static int longestSubArray(int[] arr){
        int count = 0;
        for(int  i = 1;i < arr.length;i++){
            int sum = arr[i] + arr[i-1];
            if(sum % 2 == 0)
                count = 0;
            else
                count++;
        }
        return (count != 0?count+1:0);
    }
}
