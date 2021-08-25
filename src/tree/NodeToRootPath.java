package tree;
import tree.GenericTreeInp.*;


import java.util.ArrayList;

import static tree.GenericTreeInp.createTree;

public class NodeToRootPath {
    public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        if (node.data == data){
            list.add(node.data);
            return list;
        }
        else{
            for(Node child : node.children){
                list = nodeToRootPath(child,data);
                if (list.size() > 0)
                    break;
            }
        }
        if (list.size() > 0)
            list.add(node.data);
        return list;
    }
    public static void main(String[] args) {
        int[] inp = {10 ,20 ,50, -1, 60, -1 ,-1 ,30 ,70 ,-1, 80 ,110, -1 ,120, -1 ,-1 ,90, -1, -1 ,40, 100, -1, -1, -1};
        Node root = createTree(inp);
        System.out.println(nodeToRootPath(root, 100));

    }
}
