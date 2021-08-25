package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;
import static tree.GenericTreeInp.display;

public class SearchingInTree {

    public static boolean search(Node node,int data){
        if (node.data == data)
            return true;
        for (Node child : node.children){
            if(search(child,data))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        System.out.println(search(root, 140));

    }
}
