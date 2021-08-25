package tree;
import tree.GenericTreeInp.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import static tree.GenericTreeInp.createTree;
import static tree.GenericTreeInp.display;


public class LineariseTree {

    public static void linearize(Node node){

        for(Node child : node.children)
            linearize(child);

        for(int i = (node.children.size()-2);i >= 0 ;i--){
            Node tl = getLast(node.children.get(i));
            Node nf = node.children.get((i+1));
            tl.children.add(nf);
            node.children.remove(nf);
        }
    }

    private static Node getLast(Node node) {
        while(node.children.size() != 0)
            node = node.children.get(0);

        return node;
    }

    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        linearize(root);
        display(root);

    }
}
