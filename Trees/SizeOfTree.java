// Calculate the Size of a Binary Search Tree

public class SizeOfTree {
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

    public int sizeOfTreeRec(Node root) {
        if(root == null)
            return 0;

        int left_size = sizeOfTreeRec(root.left);
        int right_size = sizeOfTreeRec(root.right);

        return (1 + left_size + right_size);

    }

    public static void main(String[] args) {
        SizeOfTree bt = new SizeOfTree();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 7);
        bt.root = bt.insert(bt.root, 20);

        System.out.println("Recursively, the size of this tree is: " + bt.sizeOfTreeRec(bt.root));
    }
}
