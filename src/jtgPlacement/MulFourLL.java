package jtgPlacement;

public class MulFourLL {
    public static class Node{
        int data;
        Node next;
        Node(int data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(0,null);
        Node node2 = new Node(0,node1);
        Node node3 = new Node(0,node2);
        Node node4 = new Node(5,node3);

        printList(node4);
        Node node = mulFour(node4);
        printList(node);
    }

    private static void printList(Node node) {
        while (node != null){
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    private static Node mulFour(Node head) {
        int carry = mulFourToLL(head);
        if (carry != 0)
            return new Node(carry,head);
        return head;
    }

    private static int mulFourToLL(Node head) {
        int res;
        if (head.next == null){
            res = head.data * 4;
        }
        else{
            res = (head.data*4) + mulFourToLL(head.next);
        }
        head.data = res%10;
        return res/10;

    }
}
