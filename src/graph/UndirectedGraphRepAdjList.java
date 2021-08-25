package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class UndirectedGraphRepAdjList {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void unweighted() throws IOException {

        int n,m;
        n = Integer.parseInt(next());
        m = Integer.parseInt(next());

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(next());
            int v = Integer.parseInt(next());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
//        show(adj);
    }

    public static void weighted()throws IOException{

        int n,m;
        n = Integer.parseInt(next());
        m = Integer.parseInt(next());

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            int u = Integer.parseInt(next());
            int v = Integer.parseInt(next());
            int w = Integer.parseInt(next());
//            adjList.get(u).add();
        }
//        show(adjList);
    }

    /*private static void show(ArrayList<ArrayList<HashMap<Integer, Integer>>> adjList) {

        for (ArrayList<HashMap<Integer, Integer>> row : adjList) {
            for (int i = 0; i < row.size(); i++) {

            }
            System.out.println();
        }

    }*/

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
