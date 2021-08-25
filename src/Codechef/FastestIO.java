package Codechef;

import java.io.*;
import java.util.*;

public class FastestIO {
    static int mod = 1000_000_007;
    static long mod1 = 998244353;
    static boolean fileIO = false;

    //If memory is the issue set this to true
    static boolean memory = true;
    static FastScanner f;
    static PrintWriter pw;
    static double eps = (double)1e-6;
    static int oo = (int)1e9;

    /*
    * Update the value of the number of test case t and tt
    * Declare all the Global variable here as static*/

    public static void solve() throws Exception {
        //Enter your solution here


    }

    public static void main(String[] args)throws Exception {
        if(memory) new Thread(null, new Runnable() {public void run(){try{new FastestIO().run();}catch(Exception e){e.printStackTrace();System.exit(1);}}}, "", 1 << 28).start();
        else new FastestIO().run();
    }

    /******************************END OF MAIN PROGRAM*******************************************/
    void run()throws Exception {
        f = new FastScanner();
        pw = new PrintWriter(System.out);

        // t denotes the number of test cases
        int t = 1;
        //current test case
        int tt = 1;

        while(t-- > 0) {
            //p("Case #" + (tt++) + ": ");
            //fw.write("\n");
            solve();
        }

        pw.flush();
        pw.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) throws Exception {
            try {
                br = new BufferedReader(new FileReader(fileName));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next()throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        //Function for accepting int
        public int ni() throws IOException {return Integer.parseInt(next());}

        //Function for accepting long
        public long nl() throws IOException {return Long.parseLong(next());}

        //Function for accepting String
        public String nextLine() throws IOException {return br.readLine();}

        //Function for accepting double
        public double nd() throws IOException {return Double.parseDouble(next());}
    }

    //Equivalent of System.out.println()
    public static void pn(Object... o) {for(int i = 0; i < o.length; ++i) pw.print(o[i] + (i + 1 < o.length ? " ": "\n"));}
    //Equivalent of System.out.print()
    public static void p(Object... o) {for(int i = 0; i < o.length; ++i) pw.print(o[i] + (i + 1 < o.length ? " " : ""));}
    public static void pni(Object... o) {for(Object obj : o) pw.print(obj + " "); pw.println(); pw.flush();}
}
