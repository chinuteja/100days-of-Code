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

class Solution {

    /* you only have to complete the function given below.
    Node is defined as

    class Node {
        int data;
        Node left;
        Node right;
    }

    */
    static int maxlevel = 0;
    public static void LeftView(Node node,int level) {
        if (node == null) {
            return;
        }
        if (maxlevel < level) {
            System.out.print(node.data+" ");
            // LeftView(node.left);
            maxlevel = level;
        }
        LeftView(node.left,level+1);
        LeftView(node.right,level + 1);

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
        LeftView(root,1);
    }
}