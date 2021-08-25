package tree;
import tree.GenericTreeInp.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import static tree.GenericTreeInp.createTree;
import static tree.GenericTreeInp.display;


public class GenMirror {
    public static void mirror(Node node){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            ArrayList<Node> child = new ArrayList<>();
            Node temp = queue.poll();
            for(int i = temp.children.size()-1; i >=0; i--){
                child.add(temp.children.get(i));
                queue.offer(temp.children.get(i));
            }
            temp.children = child;
        }
    }

    public static void main(String[] args) {
        int[] inp = {10, 20 ,50, -1 ,60 ,-1, -1 ,30 ,70, -1 ,80, 110 ,-1 ,120, -1, -1, 90 ,-1, -1 ,40, 100, -1 ,-1 ,-1};
        Node root = createTree(inp);
        display(root);
        mirror(root);
        display(root);

    }
}
