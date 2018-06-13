// Return the Nth node of the Linked List. Iterative & Recursive.

import java.util.*;

public class GetNthNode {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void append(int new_data) {
        if(head == null){
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

    public int findNthNode(Node head, int index) {
        if(head == null)
            return -999;

        Node n = head;
        for(int i=0; i<index; i++) {
            n = n.next;
        }
        return n.data;
    }

    public int findNthNodeRecursively(Node head, int index) {
        if(head == null)
            return -999;

        if(index == 0)
            return head.data;

        return findNthNodeRecursively(head.next, index-1);
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        GetNthNode llist = new GetNthNode();

        llist.append(10);
        llist.append(20);
        llist.append(30);
        llist.append(40);

        System.out.print("Enter the index number: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        llist.printList();
        System.out.println("The data at index number " + index + " is " + llist.findNthNode(llist.head, index));
        System.out.println("Using Recursion, the data at index " + index + " is " + llist.findNthNodeRecursively(llist.head, index));
    }
}