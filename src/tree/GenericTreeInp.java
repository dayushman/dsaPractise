package tree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeInp {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static Node createTree(int[] input){
        Stack<Node> stack = new Stack<>();
        Node root = null;
        for (int i =0;i < input.length; i++){
            int data = input[i];
            if (data == -1)
                stack.pop();
            else{
                Node t = new Node();
                t.data = data;
                if (stack.isEmpty())
                    root = t;
                else{
                    stack.peek().children.add(t);
                }
                stack.push(t);
            }
        }
        return root;
    }

    public static void display(Node node){
        StringBuilder str = new StringBuilder(node.data + "-> ");
        for(Node child : node.children){
            str.append(child.data).append(", ");
        }
        str.append(".");
        System.out.println(str.toString());
        for(Node child : node.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] inp  = {10,2,3,-1,4,-1,-1,11,-1,-1};
        Node root = createTree(inp);
        display(root);
    }

}