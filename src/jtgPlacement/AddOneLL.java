package jtgPlacement;

public class AddOneLL {
    public static class Node{
        int data;
        Node next;
        Node(int data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(9,null);
        Node node2 = new Node(9,node1);
        Node node3 = new Node(9,node2);
        Node node4 = new Node(1,node3);

        Node node = addOne(node4);
    }

    private static Node addOne(Node head) {
        int carry = addOneToLL(head);
        if (carry == 1){
            return new Node(1,head);
        }
        return head;
    }

    private static int addOneToLL(Node head) {
        if (head == null)
            return 1;
        int res = head.data + addOneToLL(head.next);
        head.data = res % 10;
        return res/10;
    }


}
