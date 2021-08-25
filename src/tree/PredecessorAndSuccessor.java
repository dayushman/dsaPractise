package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;

public class PredecessorAndSuccessor {
    static Node predecessor;
    static Node successor;
    static int state;

    public static void predecessorAndSuccessor(Node node, int data) {
        // write your code here
        if (state == 0){
            if (data == node.data){
                state = 1;
            }else{
                predecessor = node;
            }
        }else if (state == 1){
            state = 2;
            successor = node;
        }else if (state == 2){
            return;
        }
        for (Node children : node.children){
            predecessorAndSuccessor(children,data);
        }
    }

    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        predecessor = null;
        successor = null;
        state = 0;
        predecessorAndSuccessor(root, 20);
        System.out.println(predecessor.data);
        System.out.println(successor.data);

    }
}
