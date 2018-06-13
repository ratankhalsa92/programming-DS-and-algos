// Search for a given element (Key) in the Linked List using Iteration & Recursion

import java.util.*;

public class SearchForElement {
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

    public boolean searchForElement(int key) {
        if(head == null)
            return false;

        Node n = head;

        while(n != null) {
            if(n.data == key)
                return true;

            n = n.next;
        }

        return false;
    }

    public boolean searchForElementRecursive(Node n, int key) {
        if(n == null)
            return false;

        if(n.data == key)
            return true;

        return searchForElementRecursive(n.next, key);
    }

    public static void main(String[] args) {
        SearchForElement llist = new SearchForElement();

        llist.append(10);
        llist.append(20);
        llist.append(30);
        llist.append(40);

        llist.printList();

        System.out.println("Enter the value to be searched: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        if(llist.searchForElement(key))
            System.out.println("True");
        else
            System.out.println("False");

        if(llist.searchForElementRecursive(llist.head, key))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
