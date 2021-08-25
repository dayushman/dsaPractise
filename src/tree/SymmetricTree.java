package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;
import static tree.MirrorTree.areMirror;

public class SymmetricTree {
    public static boolean IsSymmetric(Node node) {
        // write your code here
        return areMirror(node,node);
    }

    public static void main(String[] args) {
        int[] inp = {10, 20 ,50, -1 ,60 ,-1, -1 ,30, 70 ,-1 ,80 ,-1 ,90, -1 ,-1 ,40 ,100, -1, 110, -1 ,-1, -1};
        Node root = createTree(inp);
        System.out.println(IsSymmetric(root));
    }
}
