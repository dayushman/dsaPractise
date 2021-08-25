package graph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> bfs = new ArrayList<>(n);
        Boolean[] visit = new Boolean[n+1];

    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int element, Queue<Integer> bfs){
        if (vis[element]){
            return;
        }
        vis[element] = true;
        System.out.println(element + "  ");
        ArrayList<Integer> neighbours = adj.get(element);
        bfs.addAll(neighbours);
        if (!bfs.isEmpty())
            bfs(adj, vis, bfs.poll(), bfs);

    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj , boolean[] vis , int element, Stack<Integer> dfs){
        if (vis[element])
            return;
        vis[element] = true;
        System.out.println(element + "  ");
        ArrayList<Integer> neighbours = adj.get(element);
        for (Integer ele : neighbours) {
            dfs.push(ele);
        }
        if (!dfs.isEmpty())
            dfs(adj, vis, dfs.pop(), dfs);
    }
}
