// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class solution {
  
    // Given a binary tree. Print
    // its nodes in level order
    // using array for implementing queue
    static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.  
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            // Enqueue left child
            if (curr.left != null) {
                queue.add(curr.left);
            }

            // Enqueue right child
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printLevelOrder(root);
    }
}
