package tree;
import tree.GenericTreeInp.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import static tree.GenericTreeInp.createTree;
import static tree.GenericTreeInp.display;

public class RemoveLeaves {

    public static void removeLeaves(Node node){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            ArrayList<Node> childrens = new ArrayList<>();
            for (Node child : temp.children){
                if (!child.children.isEmpty())
                    childrens.add(child);
            }
            temp.children = childrens;
            queue.addAll(temp.children);
        }
    }

    public static void main(String[] args) {
        int[] inp = {10, 20 ,50, -1 ,60 ,-1, -1 ,30 ,70, -1 ,80, 110 ,-1 ,120, -1, -1, 90 ,-1, -1 ,40, 100, -1 ,-1 ,-1};
        Node root = createTree(inp);
        removeLeaves(root);
        display(root);

    }
}
