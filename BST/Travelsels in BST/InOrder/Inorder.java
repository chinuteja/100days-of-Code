import java.util.*;
import java.io.*;
import java.util.LinkedList; 
import java.util.Queue;
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

class Inorder {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void InorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data + " ");
        InorderTraversal(root.right);
      
    }
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            // Node cur;
            if(data <= root.data) {
                root.left = insert(root.left, data);
                // root.left = cur;
            } else {
                root.right = insert(root.right, data);
                // root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        InorderTraversal(root);
    }	
}