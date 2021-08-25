package Codechef;
import java.util.Scanner;

public class Chfheist {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = Integer.parseInt(sc.next());

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < test; i++) {

            int D = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int P = Integer.parseInt(sc.next());
            int Q = Integer.parseInt(sc.next());
            long sum = 0;
            long mul = 0;
            sum = (long) D *P;
            if(D > d){
              mul = D/d;
              long rate = (mul*(mul-1))/2;
              sum = sum + (rate*Q*d);
              sum = sum + (mul*Q*(D%d));
            }
            ans.append(sum).append("\n");
        }
        System.out.println(ans);
    }
}
