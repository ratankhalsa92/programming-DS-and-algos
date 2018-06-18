// Breadth First Search in a Binary Search Tree

import java.util.*;

public class BFS {
    Node root;

    public Node insert(Node root, int data) {
        Node node = new Node(data);

        if (root == null)
            return node;

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (current.data <= data)
                current = current.right;
            else
                current = current.left;
        }

        if (parent.data <= data)
            parent.right = node;
        else
            parent.left = node;

        return root;
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    public int heightOfTree(Node root) {
        if(root == null)
            return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return (1 + Math.max(leftHeight, rightHeight));
    }

    /* function to print level order traversal of tree*/
    public void printLevelOrder(Node root) {
        int h = heightOfTree(root);
        int i;
        for(i=0; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Print nodes at the given level */
    public void printGivenLevel(Node root, int level) {
        if(root == null)
            return;
        if(level == 1)
            System.out.println(root.data + " ");
        else if(level > 1){
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    public static void main(String[] args) {
        BFS bt = new BFS();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 7);
        bt.root = bt.insert(bt.root, 20);

        System.out.print("Recursively, BFS gives us nodes in this order: ");
        bt.printLevelOrder(bt.root);
    }
}
