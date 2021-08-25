package tree;
import tree.GenericTreeInp.*;

import static tree.GenericTreeInp.createTree;

public class MultiSolver {
    static int size;
    static int max;
    static int min;
    static int height;
    public static void multiSolver(Node node,int depth){
        size++;
        min = Math.min(min, node.data);
        max = Math.max(max,node.data);
        height = Math.max(height,depth);

        for (Node child : node.children)
            multiSolver(child,depth+1);
    }

    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        size = 0;
        max= Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        height = 0;
        multiSolver(root,0);
        System.out.println("Size = "+size);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Height = "+height);
    }
}
