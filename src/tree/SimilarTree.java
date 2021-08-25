package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;

public class SimilarTree {
    public static boolean areSimilar(Node n1, Node n2) {
        // write your code here
        if (n1.children.size() != n2.children.size())
            return false;
        for(int i =0; i < n1.children.size(); i++){
            if(!areSimilar(n1.children.get(i),n2.children.get(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        int[] inp2 = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node node1 = createTree(inp);
        Node node2 = createTree(inp2);
        System.out.println(areSimilar(node1,node2));
    }
}
