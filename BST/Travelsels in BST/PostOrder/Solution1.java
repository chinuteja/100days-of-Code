import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution1 {

    /* you only have to complete the function given below.
    Node is defined as

    class Node {
        int data;
        Node left;
        Node right;
    }

    */

    public static void postOrder(Node root) {
        if (root == null) {
            return ;
        }

        Stack<Node> stack = new Stack();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.peek();
            if (temp.left == null && temp.right == null) {
                Node pop = stack.pop();
                System.out.print(pop.data + " ");
            } else {
                if (temp.right != null) {
                    stack.push(temp.right);
                    // System.out.println("right "+temp.data);
                    temp.right = null;
                }

                if (temp.left != null) {
                    stack.push(temp.left);
                    // System.out.println("left "+temp.data);
                    temp.left = null;
                }
            }
        }

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}