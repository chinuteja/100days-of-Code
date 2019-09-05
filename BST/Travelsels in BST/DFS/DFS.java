import java.util.*;
import java.io.*;
import java.util.LinkedList; 
import java.util.Queue;
/**
 * this is similar to PRE ORDER
 */
/**
 * Class for node.
 */
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

class DFS {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    public static void DepthFirstSearch(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        DepthFirstSearch(root.left);
        DepthFirstSearch(root.right);

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
        DepthFirstSearch(root);
    }	
}