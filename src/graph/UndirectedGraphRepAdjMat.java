package graph;

import java.io.*;
import java.util.*;

public class UndirectedGraphRepAdjMat {

    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void unweighted() throws IOException {

        int n,m;
        n = Integer.parseInt(next());
        m = Integer.parseInt(next());

        int[][] adj = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(next());
            int v = Integer.parseInt(next());
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        show(adj);
    }

    public static void weighted()throws IOException{

        int n,m;
        n = Integer.parseInt(next());
        m = Integer.parseInt(next());

        int[][] adj = new int[n+1][n+1];
        for (int i = 0; i < m; i++){
            int u = Integer.parseInt(next());
            int v = Integer.parseInt(next());
            int w = Integer.parseInt(next());
            adj[u][v] = w;
            adj[v][u] = w;
        }
        show(adj);
    }

    private static void show(int[][] adj) {

        for (int[] row : adj) {
            System.out.println(Arrays.toString(row));
        }

    }

    public static String next() throws IOException {
        if (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("Press 0 for Weighted , 1 for Unweighted graph and 2 for exit");
            int choice = Integer.parseInt(next());
            switch (choice){
                case 0:
                    weighted();
                    break;
                case 1:
                    unweighted();
                    break;
                case 2:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please Enter Correct Choice");
            }
        }
    }

}
