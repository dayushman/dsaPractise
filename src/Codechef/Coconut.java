package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Coconut {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int test = Integer.parseInt(sc.next());

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < test; i++) {

            int xa = Integer.parseInt(sc.next());
            int xb = Integer.parseInt(sc.next());
            int Xa = Integer.parseInt(sc.next());
            int Xb = Integer.parseInt(sc.next());

            long sum = (Xa/xa) + (Xb/xb);

            ans.append(sum).append("\n");
        }
        System.out.println(ans);
    }
}
