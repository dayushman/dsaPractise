package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;

public class MirrorTree {
    public static boolean areMirror(Node n1, Node n2) {
        // write your code here
        if (n1.children.size() != n2.children.size())
            return false;
        for(int i =0; i< n1.children.size();i++){
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get((n2.children.size()-1) - i);
            if (!areMirror(c1, c2))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] inp = {10 ,20 ,-1, 30, 50 ,-1 ,60, -1, -1, 40, -1, -1};
        int[] inp2 = {100, 200 ,-1 ,300 ,500, -1, 600, -1 ,-1, 400, -1, -1};
        Node node1 = createTree(inp);
        Node node2 = createTree(inp2);
        System.out.println(areMirror(node1,node2));
    }
}
