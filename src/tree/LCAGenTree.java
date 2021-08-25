package tree;
import tree.GenericTreeInp.*;

import java.util.ArrayList;

import static tree.GenericTreeInp.createTree;
import static tree.NodeToRootPath.nodeToRootPath;

public class LCAGenTree {

    public static int lca(Node node,int d1,int d2){
        ArrayList<Integer> l1 = nodeToRootPath(node,d1);
        ArrayList<Integer> l2 = nodeToRootPath(node,d2);

        int i = l1.size() -1;
        int j = l2.size() - 1;
        while(i>=0 && j>=0 && (l1.get(i) == l2.get(j))){
            i--;
            j--;
        }
        i++;
        j++;
        return l1.get(i);
    }
    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        System.out.println(nodeToRootPath(root, 10));
        System.out.println(nodeToRootPath(root, 120));
        System.out.println(lca(root, 10,120));


    }
}
