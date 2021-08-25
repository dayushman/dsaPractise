package tree;
import tree.GenericTreeInp.Node;

import java.util.*;

public class GenLevelOrder {


    public static void traversals(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            for (Node child : temp.children)
                queue.add(child);
        }
        System.out.println(".");
    }

    public static void traversalsLineWise(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Queue<Node> cQueue = new LinkedList<>();
            while (!queue.isEmpty()){
                Node temp = queue.poll();
                cQueue.addAll(temp.children);
                System.out.print(temp.data+" ");
            }
            System.out.println();
            queue = cQueue;
        }
    }

    public static void traversalLevelOrderZigZag(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        int level = 1;
        while (!stack.isEmpty()){
            Stack<Node> cStack = new Stack<>();
            while (!stack.isEmpty()){
                Node temp = stack.pop();
                if ((level % 2) == 0){
                    for (int i = temp.children.size()-1; i >=0 ; i--) {
                        cStack.push(temp.children.get(i));
                    }
                }else{
                    for (int i = 0; i < temp.children.size(); i++) {
                        cStack.push(temp.children.get(i));
                    }
                }
                System.out.print(temp.data+" ");
            }
            System.out.println();
            level ++;
            stack = cStack;
        }
    }
    public static void main(String[] args) {
        int[] inp = {10, 20 ,50, -1 ,60 ,-1, -1 ,30 ,70, -1 ,80, 110 ,-1 ,120, -1, -1, 90 ,-1, -1 ,40, 100, -1 ,-1 ,-1};
        GenericTreeInp.Node root = GenericTreeInp.createTree(inp);
        traversals(root);
        traversalsLineWise(root);
        traversalLevelOrderZigZag(root);
    }
}
