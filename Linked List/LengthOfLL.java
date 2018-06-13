// Find the Length of a Linked List both using Iteration & Recursion.

import java.util.*;

public class LengthOfLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void append(int new_data) {
        if(head == null) {
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);

        Node n = head;
        while(n.next != null) {
            n = n.next;
        }
        n.next = new_node;
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int countNodes() {
        Node n = head;
        int count = 0;

        if(head == null)
            return 0;

        while(n != null){
            count++;
            n = n.next;
        }
        return count;
    }

    public int countNodesRecursion(Node n) {

        if(n == null)
            return 0;

        return 1 + countNodesRecursion(n.next);
    }

    public static void main(String[] args) {
        LengthOfLL llist = new LengthOfLL();

        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);

        llist.printList();

        System.out.println("Regular count: " + llist.countNodes());
        System.out.println("Recursion count: " + llist.countNodesRecursion(llist.head));
    }
}
